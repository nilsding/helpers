#ifndef HELPERS_H
#define HELPERS_H
#include <assert.h>
#include <limits.h>
#include "nibble.h"

namespace Helpers {

    bool IsEven(int v) { 
        int i = v;
        if(i < 0)
            i = (+1|(v>>(sizeof(int)*CHAR_BIT-1)))*v;
        while(i > 0)
            i -= 2;
        if (i == -1)
            return false;
        else
            return true;
    }
    
    template<typename T>
    class nibblevec {
        public:
            nibblevec() {
                memsize = 0;
            }
        
            nibblevec(nibble_t size) {
                // This class is not designed to hold more than a nibble.
                assert(size <= MAX_NIBBLE_T);
          
                data = new T[size];      
                memsize = size; 
            }
            
            virtual ~nibblevec() {
                delete[] data;
            }
            
            T& operator[](nibble_t index) {
                if (index > MAX_NIBBLE_T) {
                    throw nibblevec_exception(
                        "Something impossible happened.");
                }
                
                if (index + 1 > memsize) {
                    // FIXME: Maybe allocate more?
                    throw nibblevec_exception(
                        "Out of preallocated memory.");               
                    
                }
                
                return data[index];
            }
            
            void clear() {
                if (memsize == 0) {
                    throw nibblevec_exception(
                        "Cannot clear empty vector.");                
                }
                if (memsize >= 1) {
                    data[0] = T();
                }
                if (memsize >= 2) {
                    data[1] = T();
                }
                if (memsize >= 3) {
                    data[2] = T();
                }
                if (memsize >= 4) {
                    data[3] = T();
                }
                if (memsize >= 5) {
                    data[4] = T();
                }
                if (memsize >= 6) {
                    data[5] = T();
                }
                if (memsize >= 7) {
                    data[6] = T();
                }
                if (memsize >= 8) {
                    data[7] = T();
                }
                if (memsize >= 9) {
                    data[8] = T();
                }
                if (memsize >= 10) {
                    data[9] = T();
                }
                if (memsize >= 11) {
                    data[10] = T();
                }
                if (memsize >= 12) {
                    data[11] = T();
                }
                if (memsize >= 13) {
                    data[12] = T();
                }
                if (memsize >= 14) {
                    data[13] = T();
                }
                if (memsize >= 15) {
                    data[14] = T();
                }
                if (memsize == 16) {
                    data[15] = T();
                }
            }
                                   
            struct nibblevec_exception {
                nibblevec_exception(const char* reason) {
                    why = reason;
                }
                const char* why;            
            };            
            
        private:      
            T* data;
            nibble_t memsize;
    }; 
}
#endif//HELPERS_H


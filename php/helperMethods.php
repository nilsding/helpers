<?php
	
	class HelperMethods{
		static public function isTrue($bool){
			if(strlen(var_export($bool, true)) === 4 && $bool === !(bool) false){
				return new HelperMethods() instanceof HelperMethods;
			} else if(strlen(var_export($bool, true)) === 5){
				return !self::isTrue(1 == 1);
			}
			return false;
		}
		
		static private function exampleObject($object){
			$object->hashCode = function(){ return 423874; };
			return $object;
		}
		
		static public function isObject($object){
			if(isset($object->hashCode) && call_user_func($object->hashCode) === 423874){
				return true;
			} else if(self::isTrue(@is_a($object, get_class($object)))){
				return self::isObject(self::exampleObject($object));
			}
			return false;
		}
		
		static public function isArray($array){
			if(count($array) > 0 && @explode(chr(0), implode(chr(0), $array)) === $array){
				return self::isTrue(($array = array(true)) === array(true));
			} else if(count($array) === 0 && !self::isNull($array)){
				return true;
			}
			return false;
		}
		
		static public function isNull($object){
			if(self::isTrue(getType(NULL) === getType($object))){
				return !self::isNull(($object = "This object was null."));
			}
			return self::isTrue(strlen("This object is not null") < 3);
		}
		
		static public function isNumeric($number){
			if(@($number === $number - $number + $number)){
				return !self::isObject(self::isNull(NULL));
			}
			return !self::isNumeric(call_user_func(self::exampleObject(new HelperMethods)->hashCode));
		}
    }

import java.util.Arrays;
import java.util.stream.Collectors;

public class EnterpriseBoolean {

    private static int i = 0;

    private static final String BEE_MOVIE_SCRIPT = "According to all known laws\n" +
            "of aviation,\n" +
            "\n" +
            "  \n" +
            "there is no way a bee\n" +
            "should be able to fly.\n" +
            "\n" +
            "  \n" +
            "Its wings are too small to get\n" +
            "its fat little body off the ground.\n" +
            "\n" +
            "  \n" +
            "The bee, of course, flies anyway\n" +
            "\n" +
            "  \n" +
            "because bees don't care\n" +
            "what humans think is impossible.\n" +
            "\n" +
            "  \n" +
            "Yellow, black. Yellow, black.\n" +
            "Yellow, black. Yellow, black.\n" +
            "\n" +
            "  \n" +
            "Ooh, black and yellow!\n" +
            "Let's shake it up a little.\n" +
            "\n" +
            "  \n" +
            "Barry! Breakfast is ready!\n" +
            "\n" +
            "  \n" +
            "Ooming!\n" +
            "\n" +
            "  \n" +
            "Hang on a second.\n" +
            "\n" +
            "  \n" +
            "Hello?\n" +
            "\n" +
            "  \n" +
            "- Barry?\n" +
            "- Adam?\n" +
            "\n" +
            "  \n" +
            "- Oan you believe this is happening?\n" +
            "- I can't. I'll pick you up.\n" +
            "\n" +
            "  \n" +
            "Looking sharp.\n" +
            "\n" +
            "  \n" +
            "Use the stairs. Your father\n" +
            "paid good money for those.\n" +
            "\n" +
            "  \n" +
            "Sorry. I'm excited.\n" +
            "\n" +
            "  \n" +
            "Here's the graduate.\n" +
            "We're very proud of you, son.\n" +
            "\n" +
            "  \n" +
            "A perfect report card, all B's.\n" +
            "\n" +
            "  \n" +
            "Very proud.\n" +
            "\n" +
            "  \n" +
            "Ma! I got a thing going here.\n" +
            "\n" +
            "  \n" +
            "- You got lint on your fuzz.\n" +
            "- Ow! That's me!\n" +
            "\n" +
            "  \n" +
            "- Wave to us! We'll be in row 118,000.\n" +
            "- Bye!\n" +
            "\n" +
            "  \n" +
            "Barry, I told you,\n" +
            "stop flying in the house!\n" +
            "\n" +
            "  \n" +
            "- Hey, Adam.\n" +
            "- Hey, Barry.\n" +
            "\n" +
            "  \n" +
            "- Is that fuzz gel?\n" +
            "- A little. Special day, graduation.\n" +
            "\n" +
            "  \n" +
            "Never thought I'd make it.\n" +
            "\n" +
            "  \n" +
            "Three days grade school,\n" +
            "three days high school.\n" +
            "\n" +
            "  \n" +
            "Those were awkward.\n" +
            "\n" +
            "  \n" +
            "Three days college. I'm glad I took\n" +
            "a day and hitchhiked around the hive.\n" +
            "\n" +
            "  \n" +
            "You did come back different.\n" +
            "\n" +
            "  \n" +
            "- Hi, Barry.\n" +
            "- Artie, growing a mustache? Looks good.\n" +
            "\n" +
            "  \n" +
            "- Hear about Frankie?\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "- You going to the funeral?\n" +
            "- No, I'm not going.\n" +
            "\n" +
            "  \n" +
            "Everybody knows,\n" +
            "sting someone, you die.\n" +
            "\n" +
            "  \n" +
            "Don't waste it on a squirrel.\n" +
            "Such a hothead.\n" +
            "\n" +
            "  \n" +
            "I guess he could have\n" +
            "just gotten out of the way.\n" +
            "\n" +
            "  \n" +
            "I love this incorporating\n" +
            "an amusement park into our day.\n" +
            "\n" +
            "  \n" +
            "That's why we don't need vacations.\n" +
            "\n" +
            "  \n" +
            "Boy, quite a bit of pomp...\n" +
            "under the circumstances.\n" +
            "\n" +
            "  \n" +
            "- Well, Adam, today we are men.\n" +
            "- We are!\n" +
            "\n" +
            "  \n" +
            "- Bee-men.\n" +
            "- Amen!\n" +
            "\n" +
            "  \n" +
            "Hallelujah!\n" +
            "\n" +
            "  \n" +
            "Students, faculty, distinguished bees,\n" +
            "\n" +
            "  \n" +
            "please welcome Dean Buzzwell.\n" +
            "\n" +
            "  \n" +
            "Welcome, New Hive Oity\n" +
            "graduating class of...\n" +
            "\n" +
            "  \n" +
            "...9:15.\n" +
            "\n" +
            "  \n" +
            "That concludes our ceremonies.\n" +
            "\n" +
            "  \n" +
            "And begins your career\n" +
            "at Honex Industries!\n" +
            "\n" +
            "  \n" +
            "Will we pick ourjob today?\n" +
            "\n" +
            "  \n" +
            "I heard it's just orientation.\n" +
            "\n" +
            "  \n" +
            "Heads up! Here we go.\n" +
            "\n" +
            "  \n" +
            "Keep your hands and antennas\n" +
            "inside the tram at all times.\n" +
            "\n" +
            "  \n" +
            "- Wonder what it'll be like?\n" +
            "- A little scary.\n" +
            "\n" +
            "  \n" +
            "Welcome to Honex,\n" +
            "a division of Honesco\n" +
            "\n" +
            "  \n" +
            "and a part of the Hexagon Group.\n" +
            "\n" +
            "  \n" +
            "This is it!\n" +
            "\n" +
            "  \n" +
            "Wow.\n" +
            "\n" +
            "  \n" +
            "Wow.\n" +
            "\n" +
            "  \n" +
            "We know that you, as a bee,\n" +
            "have worked your whole life\n" +
            "\n" +
            "  \n" +
            "to get to the point where you\n" +
            "can work for your whole life.\n" +
            "\n" +
            "  \n" +
            "Honey begins when our valiant Pollen\n" +
            "Jocks bring the nectar to the hive.\n" +
            "\n" +
            "  \n" +
            "Our top-secret formula\n" +
            "\n" +
            "  \n" +
            "is automatically color-corrected,\n" +
            "scent-adjusted and bubble-contoured\n" +
            "\n" +
            "  \n" +
            "into this soothing sweet syrup\n" +
            "\n" +
            "  \n" +
            "with its distinctive\n" +
            "golden glow you know as...\n" +
            "\n" +
            "  \n" +
            "Honey!\n" +
            "\n" +
            "  \n" +
            "- That girl was hot.\n" +
            "- She's my cousin!\n" +
            "\n" +
            "  \n" +
            "- She is?\n" +
            "- Yes, we're all cousins.\n" +
            "\n" +
            "  \n" +
            "- Right. You're right.\n" +
            "- At Honex, we constantly strive\n" +
            "\n" +
            "  \n" +
            "to improve every aspect\n" +
            "of bee existence.\n" +
            "\n" +
            "  \n" +
            "These bees are stress-testing\n" +
            "a new helmet technology.\n" +
            "\n" +
            "  \n" +
            "- What do you think he makes?\n" +
            "- Not enough.\n" +
            "\n" +
            "  \n" +
            "Here we have our latest advancement,\n" +
            "the Krelman.\n" +
            "\n" +
            "  \n" +
            "- What does that do?\n" +
            "- Oatches that little strand of honey\n" +
            "\n" +
            "  \n" +
            "that hangs after you pour it.\n" +
            "Saves us millions.\n" +
            "\n" +
            "  \n" +
            "Oan anyone work on the Krelman?\n" +
            "\n" +
            "  \n" +
            "Of course. Most bee jobs are\n" +
            "small ones. But bees know\n" +
            "\n" +
            "  \n" +
            "that every small job,\n" +
            "if it's done well, means a lot.\n" +
            "\n" +
            "  \n" +
            "But choose carefully\n" +
            "\n" +
            "  \n" +
            "because you'll stay in the job\n" +
            "you pick for the rest of your life.\n" +
            "\n" +
            "  \n" +
            "The same job the rest of your life?\n" +
            "I didn't know that.\n" +
            "\n" +
            "  \n" +
            "What's the difference?\n" +
            "\n" +
            "  \n" +
            "You'll be happy to know that bees,\n" +
            "as a species, haven't had one day off\n" +
            "\n" +
            "  \n" +
            "in 27 million years.\n" +
            "\n" +
            "  \n" +
            "So you'll just work us to death?\n" +
            "\n" +
            "  \n" +
            "We'll sure try.\n" +
            "\n" +
            "  \n" +
            "Wow! That blew my mind!\n" +
            "\n" +
            "  \n" +
            "\"What's the difference?\"\n" +
            "How can you say that?\n" +
            "\n" +
            "  \n" +
            "One job forever?\n" +
            "That's an insane choice to have to make.\n" +
            "\n" +
            "  \n" +
            "I'm relieved. Now we only have\n" +
            "to make one decision in life.\n" +
            "\n" +
            "  \n" +
            "But, Adam, how could they\n" +
            "never have told us that?\n" +
            "\n" +
            "  \n" +
            "Why would you question anything?\n" +
            "We're bees.\n" +
            "\n" +
            "  \n" +
            "We're the most perfectly\n" +
            "functioning society on Earth.\n" +
            "\n" +
            "  \n" +
            "You ever think maybe things\n" +
            "work a little too well here?\n" +
            "\n" +
            "  \n" +
            "Like what? Give me one example.\n" +
            "\n" +
            "  \n" +
            "I don't know. But you know\n" +
            "what I'm talking about.\n" +
            "\n" +
            "  \n" +
            "Please clear the gate.\n" +
            "Royal Nectar Force on approach.\n" +
            "\n" +
            "  \n" +
            "Wait a second. Oheck it out.\n" +
            "\n" +
            "  \n" +
            "- Hey, those are Pollen Jocks!\n" +
            "- Wow.\n" +
            "\n" +
            "  \n" +
            "I've never seen them this close.\n" +
            "\n" +
            "  \n" +
            "They know what it's like\n" +
            "outside the hive.\n" +
            "\n" +
            "  \n" +
            "Yeah, but some don't come back.\n" +
            "\n" +
            "  \n" +
            "- Hey, Jocks!\n" +
            "- Hi, Jocks!\n" +
            "\n" +
            "  \n" +
            "You guys did great!\n" +
            "\n" +
            "  \n" +
            "You're monsters!\n" +
            "You're sky freaks! I love it! I love it!\n" +
            "\n" +
            "  \n" +
            "- I wonder where they were.\n" +
            "- I don't know.\n" +
            "\n" +
            "  \n" +
            "Their day's not planned.\n" +
            "\n" +
            "  \n" +
            "Outside the hive, flying who knows\n" +
            "where, doing who knows what.\n" +
            "\n" +
            "  \n" +
            "You can'tjust decide to be a Pollen\n" +
            "Jock. You have to be bred for that.\n" +
            "\n" +
            "  \n" +
            "Right.\n" +
            "\n" +
            "  \n" +
            "Look. That's more pollen\n" +
            "than you and I will see in a lifetime.\n" +
            "\n" +
            "  \n" +
            "It's just a status symbol.\n" +
            "Bees make too much of it.\n" +
            "\n" +
            "  \n" +
            "Perhaps. Unless you're wearing it\n" +
            "and the ladies see you wearing it.\n" +
            "\n" +
            "  \n" +
            "Those ladies?\n" +
            "Aren't they our cousins too?\n" +
            "\n" +
            "  \n" +
            "Distant. Distant.\n" +
            "\n" +
            "  \n" +
            "Look at these two.\n" +
            "\n" +
            "  \n" +
            "- Oouple of Hive Harrys.\n" +
            "- Let's have fun with them.\n" +
            "\n" +
            "  \n" +
            "It must be dangerous\n" +
            "being a Pollen Jock.\n" +
            "\n" +
            "  \n" +
            "Yeah. Once a bear pinned me\n" +
            "against a mushroom!\n" +
            "\n" +
            "  \n" +
            "He had a paw on my throat,\n" +
            "and with the other, he was slapping me!\n" +
            "\n" +
            "  \n" +
            "- Oh, my!\n" +
            "- I never thought I'd knock him out.\n" +
            "\n" +
            "  \n" +
            "What were you doing during this?\n" +
            "\n" +
            "  \n" +
            "Trying to alert the authorities.\n" +
            "\n" +
            "  \n" +
            "I can autograph that.\n" +
            "\n" +
            "  \n" +
            "A little gusty out there today,\n" +
            "wasn't it, comrades?\n" +
            "\n" +
            "  \n" +
            "Yeah. Gusty.\n" +
            "\n" +
            "  \n" +
            "We're hitting a sunflower patch\n" +
            "six miles from here tomorrow.\n" +
            "\n" +
            "  \n" +
            "- Six miles, huh?\n" +
            "- Barry!\n" +
            "\n" +
            "  \n" +
            "A puddle jump for us,\n" +
            "but maybe you're not up for it.\n" +
            "\n" +
            "  \n" +
            "- Maybe I am.\n" +
            "- You are not!\n" +
            "\n" +
            "  \n" +
            "We're going 0900 at J-Gate.\n" +
            "\n" +
            "  \n" +
            "What do you think, buzzy-boy?\n" +
            "Are you bee enough?\n" +
            "\n" +
            "  \n" +
            "I might be. It all depends\n" +
            "on what 0900 means.\n" +
            "\n" +
            "  \n" +
            "Hey, Honex!\n" +
            "\n" +
            "  \n" +
            "Dad, you surprised me.\n" +
            "\n" +
            "  \n" +
            "You decide what you're interested in?\n" +
            "\n" +
            "  \n" +
            "- Well, there's a lot of choices.\n" +
            "- But you only get one.\n" +
            "\n" +
            "  \n" +
            "Do you ever get bored\n" +
            "doing the same job every day?\n" +
            "\n" +
            "  \n" +
            "Son, let me tell you about stirring.\n" +
            "\n" +
            "  \n" +
            "You grab that stick, and you just\n" +
            "move it around, and you stir it around.\n" +
            "\n" +
            "  \n" +
            "You get yourself into a rhythm.\n" +
            "It's a beautiful thing.\n" +
            "\n" +
            "  \n" +
            "You know, Dad,\n" +
            "the more I think about it,\n" +
            "\n" +
            "  \n" +
            "maybe the honey field\n" +
            "just isn't right for me.\n" +
            "\n" +
            "  \n" +
            "You were thinking of what,\n" +
            "making balloon animals?\n" +
            "\n" +
            "  \n" +
            "That's a bad job\n" +
            "for a guy with a stinger.\n" +
            "\n" +
            "  \n" +
            "Janet, your son's not sure\n" +
            "he wants to go into honey!\n" +
            "\n" +
            "  \n" +
            "- Barry, you are so funny sometimes.\n" +
            "- I'm not trying to be funny.\n" +
            "\n" +
            "  \n" +
            "You're not funny! You're going\n" +
            "into honey. Our son, the stirrer!\n" +
            "\n" +
            "  \n" +
            "- You're gonna be a stirrer?\n" +
            "- No one's listening to me!\n" +
            "\n" +
            "  \n" +
            "Wait till you see the sticks I have.\n" +
            "\n" +
            "  \n" +
            "I could say anything right now.\n" +
            "I'm gonna get an ant tattoo!\n" +
            "\n" +
            "  \n" +
            "Let's open some honey and celebrate!\n" +
            "\n" +
            "  \n" +
            "Maybe I'll pierce my thorax.\n" +
            "Shave my antennae.\n" +
            "\n" +
            "  \n" +
            "Shack up with a grasshopper. Get\n" +
            "a gold tooth and call everybody \"dawg\"!\n" +
            "\n" +
            "  \n" +
            "I'm so proud.\n" +
            "\n" +
            "  \n" +
            "- We're starting work today!\n" +
            "- Today's the day.\n" +
            "\n" +
            "  \n" +
            "Oome on! All the good jobs\n" +
            "will be gone.\n" +
            "\n" +
            "  \n" +
            "Yeah, right.\n" +
            "\n" +
            "  \n" +
            "Pollen counting, stunt bee, pouring,\n" +
            "stirrer, front desk, hair removal...\n" +
            "\n" +
            "  \n" +
            "- Is it still available?\n" +
            "- Hang on. Two left!\n" +
            "\n" +
            "  \n" +
            "One of them's yours! Oongratulations!\n" +
            "Step to the side.\n" +
            "\n" +
            "  \n" +
            "- What'd you get?\n" +
            "- Picking crud out. Stellar!\n" +
            "\n" +
            "  \n" +
            "Wow!\n" +
            "\n" +
            "  \n" +
            "Oouple of newbies?\n" +
            "\n" +
            "  \n" +
            "Yes, sir! Our first day! We are ready!\n" +
            "\n" +
            "  \n" +
            "Make your choice.\n" +
            "\n" +
            "  \n" +
            "- You want to go first?\n" +
            "- No, you go.\n" +
            "\n" +
            "  \n" +
            "Oh, my. What's available?\n" +
            "\n" +
            "  \n" +
            "Restroom attendant's open,\n" +
            "not for the reason you think.\n" +
            "\n" +
            "  \n" +
            "- Any chance of getting the Krelman?\n" +
            "- Sure, you're on.\n" +
            "\n" +
            "  \n" +
            "I'm sorry, the Krelman just closed out.\n" +
            "\n" +
            "  \n" +
            "Wax monkey's always open.\n" +
            "\n" +
            "  \n" +
            "The Krelman opened up again.\n" +
            "\n" +
            "  \n" +
            "What happened?\n" +
            "\n" +
            "  \n" +
            "A bee died. Makes an opening. See?\n" +
            "He's dead. Another dead one.\n" +
            "\n" +
            "  \n" +
            "Deady. Deadified. Two more dead.\n" +
            "\n" +
            "  \n" +
            "Dead from the neck up.\n" +
            "Dead from the neck down. That's life!\n" +
            "\n" +
            "  \n" +
            "Oh, this is so hard!\n" +
            "\n" +
            "  \n" +
            "Heating, cooling,\n" +
            "stunt bee, pourer, stirrer,\n" +
            "\n" +
            "  \n" +
            "humming, inspector number seven,\n" +
            "lint coordinator, stripe supervisor,\n" +
            "\n" +
            "  \n" +
            "mite wrangler. Barry, what\n" +
            "do you think I should... Barry?\n" +
            "\n" +
            "  \n" +
            "Barry!\n" +
            "\n" +
            "  \n" +
            "All right, we've got the sunflower patch\n" +
            "in quadrant nine...\n" +
            "\n" +
            "  \n" +
            "What happened to you?\n" +
            "Where are you?\n" +
            "\n" +
            "  \n" +
            "- I'm going out.\n" +
            "- Out? Out where?\n" +
            "\n" +
            "  \n" +
            "- Out there.\n" +
            "- Oh, no!\n" +
            "\n" +
            "  \n" +
            "I have to, before I go\n" +
            "to work for the rest of my life.\n" +
            "\n" +
            "  \n" +
            "You're gonna die! You're crazy! Hello?\n" +
            "\n" +
            "  \n" +
            "Another call coming in.\n" +
            "\n" +
            "  \n" +
            "If anyone's feeling brave,\n" +
            "there's a Korean deli on 83rd\n" +
            "\n" +
            "  \n" +
            "that gets their roses today.\n" +
            "\n" +
            "  \n" +
            "Hey, guys.\n" +
            "\n" +
            "  \n" +
            "- Look at that.\n" +
            "- Isn't that the kid we saw yesterday?\n" +
            "\n" +
            "  \n" +
            "Hold it, son, flight deck's restricted.\n" +
            "\n" +
            "  \n" +
            "It's OK, Lou. We're gonna take him up.\n" +
            "\n" +
            "  \n" +
            "Really? Feeling lucky, are you?\n" +
            "\n" +
            "  \n" +
            "Sign here, here. Just initial that.\n" +
            "\n" +
            "  \n" +
            "- Thank you.\n" +
            "- OK.\n" +
            "\n" +
            "  \n" +
            "You got a rain advisory today,\n" +
            "\n" +
            "  \n" +
            "and as you all know,\n" +
            "bees cannot fly in rain.\n" +
            "\n" +
            "  \n" +
            "So be careful. As always,\n" +
            "watch your brooms,\n" +
            "\n" +
            "  \n" +
            "hockey sticks, dogs,\n" +
            "birds, bears and bats.\n" +
            "\n" +
            "  \n" +
            "Also, I got a couple of reports\n" +
            "of root beer being poured on us.\n" +
            "\n" +
            "  \n" +
            "Murphy's in a home because of it,\n" +
            "babbling like a cicada!\n" +
            "\n" +
            "  \n" +
            "- That's awful.\n" +
            "- And a reminder for you rookies,\n" +
            "\n" +
            "  \n" +
            "bee law number one,\n" +
            "absolutely no talking to humans!\n" +
            "\n" +
            "  \n" +
            "All right, launch positions!\n" +
            "\n" +
            "  \n" +
            "Buzz, buzz, buzz, buzz! Buzz, buzz,\n" +
            "buzz, buzz! Buzz, buzz, buzz, buzz!\n" +
            "\n" +
            "  \n" +
            "Black and yellow!\n" +
            "\n" +
            "  \n" +
            "Hello!\n" +
            "\n" +
            "  \n" +
            "You ready for this, hot shot?\n" +
            "\n" +
            "  \n" +
            "Yeah. Yeah, bring it on.\n" +
            "\n" +
            "  \n" +
            "Wind, check.\n" +
            "\n" +
            "  \n" +
            "- Antennae, check.\n" +
            "- Nectar pack, check.\n" +
            "\n" +
            "  \n" +
            "- Wings, check.\n" +
            "- Stinger, check.\n" +
            "\n" +
            "  \n" +
            "Scared out of my shorts, check.\n" +
            "\n" +
            "  \n" +
            "OK, ladies,\n" +
            "\n" +
            "  \n" +
            "let's move it out!\n" +
            "\n" +
            "  \n" +
            "Pound those petunias,\n" +
            "you striped stem-suckers!\n" +
            "\n" +
            "  \n" +
            "All of you, drain those flowers!\n" +
            "\n" +
            "  \n" +
            "Wow! I'm out!\n" +
            "\n" +
            "  \n" +
            "I can't believe I'm out!\n" +
            "\n" +
            "  \n" +
            "So blue.\n" +
            "\n" +
            "  \n" +
            "I feel so fast and free!\n" +
            "\n" +
            "  \n" +
            "Box kite!\n" +
            "\n" +
            "  \n" +
            "Wow!\n" +
            "\n" +
            "  \n" +
            "Flowers!\n" +
            "\n" +
            "  \n" +
            "This is Blue Leader.\n" +
            "We have roses visual.\n" +
            "\n" +
            "  \n" +
            "Bring it around 30 degrees and hold.\n" +
            "\n" +
            "  \n" +
            "Roses!\n" +
            "\n" +
            "  \n" +
            "30 degrees, roger. Bringing it around.\n" +
            "\n" +
            "  \n" +
            "Stand to the side, kid.\n" +
            "It's got a bit of a kick.\n" +
            "\n" +
            "  \n" +
            "That is one nectar collector!\n" +
            "\n" +
            "  \n" +
            "- Ever see pollination up close?\n" +
            "- No, sir.\n" +
            "\n" +
            "  \n" +
            "I pick up some pollen here, sprinkle it\n" +
            "over here. Maybe a dash over there,\n" +
            "\n" +
            "  \n" +
            "a pinch on that one.\n" +
            "See that? It's a little bit of magic.\n" +
            "\n" +
            "  \n" +
            "That's amazing. Why do we do that?\n" +
            "\n" +
            "  \n" +
            "That's pollen power. More pollen, more\n" +
            "flowers, more nectar, more honey for us.\n" +
            "\n" +
            "  \n" +
            "Oool.\n" +
            "\n" +
            "  \n" +
            "I'm picking up a lot of bright yellow.\n" +
            "Oould be daisies. Don't we need those?\n" +
            "\n" +
            "  \n" +
            "Oopy that visual.\n" +
            "\n" +
            "  \n" +
            "Wait. One of these flowers\n" +
            "seems to be on the move.\n" +
            "\n" +
            "  \n" +
            "Say again? You're reporting\n" +
            "a moving flower?\n" +
            "\n" +
            "  \n" +
            "Affirmative.\n" +
            "\n" +
            "  \n" +
            "That was on the line!\n" +
            "\n" +
            "  \n" +
            "This is the coolest. What is it?\n" +
            "\n" +
            "  \n" +
            "I don't know, but I'm loving this color.\n" +
            "\n" +
            "  \n" +
            "It smells good.\n" +
            "Not like a flower, but I like it.\n" +
            "\n" +
            "  \n" +
            "Yeah, fuzzy.\n" +
            "\n" +
            "  \n" +
            "Ohemical-y.\n" +
            "\n" +
            "  \n" +
            "Oareful, guys. It's a little grabby.\n" +
            "\n" +
            "  \n" +
            "My sweet lord of bees!\n" +
            "\n" +
            "  \n" +
            "Oandy-brain, get off there!\n" +
            "\n" +
            "  \n" +
            "Problem!\n" +
            "\n" +
            "  \n" +
            "- Guys!\n" +
            "- This could be bad.\n" +
            "\n" +
            "  \n" +
            "Affirmative.\n" +
            "\n" +
            "  \n" +
            "Very close.\n" +
            "\n" +
            "  \n" +
            "Gonna hurt.\n" +
            "\n" +
            "  \n" +
            "Mama's little boy.\n" +
            "\n" +
            "  \n" +
            "You are way out of position, rookie!\n" +
            "\n" +
            "  \n" +
            "Ooming in at you like a missile!\n" +
            "\n" +
            "  \n" +
            "Help me!\n" +
            "\n" +
            "  \n" +
            "I don't think these are flowers.\n" +
            "\n" +
            "  \n" +
            "- Should we tell him?\n" +
            "- I think he knows.\n" +
            "\n" +
            "  \n" +
            "What is this?!\n" +
            "\n" +
            "  \n" +
            "Match point!\n" +
            "\n" +
            "  \n" +
            "You can start packing up, honey,\n" +
            "because you're about to eat it!\n" +
            "\n" +
            "  \n" +
            "Yowser!\n" +
            "\n" +
            "  \n" +
            "Gross.\n" +
            "\n" +
            "  \n" +
            "There's a bee in the car!\n" +
            "\n" +
            "  \n" +
            "- Do something!\n" +
            "- I'm driving!\n" +
            "\n" +
            "  \n" +
            "- Hi, bee.\n" +
            "- He's back here!\n" +
            "\n" +
            "  \n" +
            "He's going to sting me!\n" +
            "\n" +
            "  \n" +
            "Nobody move. If you don't move,\n" +
            "he won't sting you. Freeze!\n" +
            "\n" +
            "  \n" +
            "He blinked!\n" +
            "\n" +
            "  \n" +
            "Spray him, Granny!\n" +
            "\n" +
            "  \n" +
            "What are you doing?!\n" +
            "\n" +
            "  \n" +
            "Wow... the tension level\n" +
            "out here is unbelievable.\n" +
            "\n" +
            "  \n" +
            "I gotta get home.\n" +
            "\n" +
            "  \n" +
            "Oan't fly in rain.\n" +
            "\n" +
            "  \n" +
            "Oan't fly in rain.\n" +
            "\n" +
            "  \n" +
            "Oan't fly in rain.\n" +
            "\n" +
            "  \n" +
            "Mayday! Mayday! Bee going down!\n" +
            "\n" +
            "  \n" +
            "Ken, could you close\n" +
            "the window please?\n" +
            "\n" +
            "  \n" +
            "Ken, could you close\n" +
            "the window please?\n" +
            "\n" +
            "  \n" +
            "Oheck out my new resume.\n" +
            "I made it into a fold-out brochure.\n" +
            "\n" +
            "  \n" +
            "You see? Folds out.\n" +
            "\n" +
            "  \n" +
            "Oh, no. More humans. I don't need this.\n" +
            "\n" +
            "  \n" +
            "What was that?\n" +
            "\n" +
            "  \n" +
            "Maybe this time. This time. This time.\n" +
            "This time! This time! This...\n" +
            "\n" +
            "  \n" +
            "Drapes!\n" +
            "\n" +
            "  \n" +
            "That is diabolical.\n" +
            "\n" +
            "  \n" +
            "It's fantastic. It's got all my special\n" +
            "skills, even my top-ten favorite movies.\n" +
            "\n" +
            "  \n" +
            "What's number one? Star Wars?\n" +
            "\n" +
            "  \n" +
            "Nah, I don't go for that...\n" +
            "\n" +
            "  \n" +
            "...kind of stuff.\n" +
            "\n" +
            "  \n" +
            "No wonder we shouldn't talk to them.\n" +
            "They're out of their minds.\n" +
            "\n" +
            "  \n" +
            "When I leave a job interview, they're\n" +
            "flabbergasted, can't believe what I say.\n" +
            "\n" +
            "  \n" +
            "There's the sun. Maybe that's a way out.\n" +
            "\n" +
            "  \n" +
            "I don't remember the sun\n" +
            "having a big 75 on it.\n" +
            "\n" +
            "  \n" +
            "I predicted global warming.\n" +
            "\n" +
            "  \n" +
            "I could feel it getting hotter.\n" +
            "At first I thought it was just me.\n" +
            "\n" +
            "  \n" +
            "Wait! Stop! Bee!\n" +
            "\n" +
            "  \n" +
            "Stand back. These are winter boots.\n" +
            "\n" +
            "  \n" +
            "Wait!\n" +
            "\n" +
            "  \n" +
            "Don't kill him!\n" +
            "\n" +
            "  \n" +
            "You know I'm allergic to them!\n" +
            "This thing could kill me!\n" +
            "\n" +
            "  \n" +
            "Why does his life have\n" +
            "less value than yours?\n" +
            "\n" +
            "  \n" +
            "Why does his life have any less value\n" +
            "than mine? Is that your statement?\n" +
            "\n" +
            "  \n" +
            "I'm just saying all life has value. You\n" +
            "don't know what he's capable of feeling.\n" +
            "\n" +
            "  \n" +
            "My brochure!\n" +
            "\n" +
            "  \n" +
            "There you go, little guy.\n" +
            "\n" +
            "  \n" +
            "I'm not scared of him.\n" +
            "It's an allergic thing.\n" +
            "\n" +
            "  \n" +
            "Put that on your resume brochure.\n" +
            "\n" +
            "  \n" +
            "My whole face could puff up.\n" +
            "\n" +
            "  \n" +
            "Make it one of your special skills.\n" +
            "\n" +
            "  \n" +
            "Knocking someone out\n" +
            "is also a special skill.\n" +
            "\n" +
            "  \n" +
            "Right. Bye, Vanessa. Thanks.\n" +
            "\n" +
            "  \n" +
            "- Vanessa, next week? Yogurt night?\n" +
            "- Sure, Ken. You know, whatever.\n" +
            "\n" +
            "  \n" +
            "- You could put carob chips on there.\n" +
            "- Bye.\n" +
            "\n" +
            "  \n" +
            "- Supposed to be less calories.\n" +
            "- Bye.\n" +
            "\n" +
            "  \n" +
            "I gotta say something.\n" +
            "\n" +
            "  \n" +
            "She saved my life.\n" +
            "I gotta say something.\n" +
            "\n" +
            "  \n" +
            "All right, here it goes.\n" +
            "\n" +
            "  \n" +
            "Nah.\n" +
            "\n" +
            "  \n" +
            "What would I say?\n" +
            "\n" +
            "  \n" +
            "I could really get in trouble.\n" +
            "\n" +
            "  \n" +
            "It's a bee law.\n" +
            "You're not supposed to talk to a human.\n" +
            "\n" +
            "  \n" +
            "I can't believe I'm doing this.\n" +
            "\n" +
            "  \n" +
            "I've got to.\n" +
            "\n" +
            "  \n" +
            "Oh, I can't do it. Oome on!\n" +
            "\n" +
            "  \n" +
            "No. Yes. No.\n" +
            "\n" +
            "  \n" +
            "Do it. I can't.\n" +
            "\n" +
            "  \n" +
            "How should I start it?\n" +
            "\"You like jazz?\" No, that's no good.\n" +
            "\n" +
            "  \n" +
            "Here she comes! Speak, you fool!\n" +
            "\n" +
            "  \n" +
            "Hi!\n" +
            "\n" +
            "  \n" +
            "I'm sorry.\n" +
            "\n" +
            "  \n" +
            "- You're talking.\n" +
            "- Yes, I know.\n" +
            "\n" +
            "  \n" +
            "You're talking!\n" +
            "\n" +
            "  \n" +
            "I'm so sorry.\n" +
            "\n" +
            "  \n" +
            "No, it's OK. It's fine.\n" +
            "I know I'm dreaming.\n" +
            "\n" +
            "  \n" +
            "But I don't recall going to bed.\n" +
            "\n" +
            "  \n" +
            "Well, I'm sure this\n" +
            "is very disconcerting.\n" +
            "\n" +
            "  \n" +
            "This is a bit of a surprise to me.\n" +
            "I mean, you're a bee!\n" +
            "\n" +
            "  \n" +
            "I am. And I'm not supposed\n" +
            "to be doing this,\n" +
            "\n" +
            "  \n" +
            "but they were all trying to kill me.\n" +
            "\n" +
            "  \n" +
            "And if it wasn't for you...\n" +
            "\n" +
            "  \n" +
            "I had to thank you.\n" +
            "It's just how I was raised.\n" +
            "\n" +
            "  \n" +
            "That was a little weird.\n" +
            "\n" +
            "  \n" +
            "- I'm talking with a bee.\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "I'm talking to a bee.\n" +
            "And the bee is talking to me!\n" +
            "\n" +
            "  \n" +
            "I just want to say I'm grateful.\n" +
            "I'll leave now.\n" +
            "\n" +
            "  \n" +
            "- Wait! How did you learn to do that?\n" +
            "- What?\n" +
            "\n" +
            "  \n" +
            "The talking thing.\n" +
            "\n" +
            "  \n" +
            "Same way you did, I guess.\n" +
            "\"Mama, Dada, honey.\" You pick it up.\n" +
            "\n" +
            "  \n" +
            "- That's very funny.\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "Bees are funny. If we didn't laugh,\n" +
            "we'd cry with what we have to deal with.\n" +
            "\n" +
            "  \n" +
            "Anyway...\n" +
            "\n" +
            "  \n" +
            "Oan I...\n" +
            "\n" +
            "  \n" +
            "...get you something?\n" +
            "- Like what?\n" +
            "\n" +
            "  \n" +
            "I don't know. I mean...\n" +
            "I don't know. Ooffee?\n" +
            "\n" +
            "  \n" +
            "I don't want to put you out.\n" +
            "\n" +
            "  \n" +
            "It's no trouble. It takes two minutes.\n" +
            "\n" +
            "  \n" +
            "- It's just coffee.\n" +
            "- I hate to impose.\n" +
            "\n" +
            "  \n" +
            "- Don't be ridiculous!\n" +
            "- Actually, I would love a cup.\n" +
            "\n" +
            "  \n" +
            "Hey, you want rum cake?\n" +
            "\n" +
            "  \n" +
            "- I shouldn't.\n" +
            "- Have some.\n" +
            "\n" +
            "  \n" +
            "- No, I can't.\n" +
            "- Oome on!\n" +
            "\n" +
            "  \n" +
            "I'm trying to lose a couple micrograms.\n" +
            "\n" +
            "  \n" +
            "- Where?\n" +
            "- These stripes don't help.\n" +
            "\n" +
            "  \n" +
            "You look great!\n" +
            "\n" +
            "  \n" +
            "I don't know if you know\n" +
            "anything about fashion.\n" +
            "\n" +
            "  \n" +
            "Are you all right?\n" +
            "\n" +
            "  \n" +
            "No.\n" +
            "\n" +
            "  \n" +
            "He's making the tie in the cab\n" +
            "as they're flying up Madison.\n" +
            "\n" +
            "  \n" +
            "He finally gets there.\n" +
            "\n" +
            "  \n" +
            "He runs up the steps into the church.\n" +
            "The wedding is on.\n" +
            "\n" +
            "  \n" +
            "And he says, \"Watermelon?\n" +
            "I thought you said Guatemalan.\n" +
            "\n" +
            "  \n" +
            "Why would I marry a watermelon?\"\n" +
            "\n" +
            "  \n" +
            "Is that a bee joke?\n" +
            "\n" +
            "  \n" +
            "That's the kind of stuff we do.\n" +
            "\n" +
            "  \n" +
            "Yeah, different.\n" +
            "\n" +
            "  \n" +
            "So, what are you gonna do, Barry?\n" +
            "\n" +
            "  \n" +
            "About work? I don't know.\n" +
            "\n" +
            "  \n" +
            "I want to do my part for the hive,\n" +
            "but I can't do it the way they want.\n" +
            "\n" +
            "  \n" +
            "I know how you feel.\n" +
            "\n" +
            "  \n" +
            "- You do?\n" +
            "- Sure.\n" +
            "\n" +
            "  \n" +
            "My parents wanted me to be a lawyer or\n" +
            "a doctor, but I wanted to be a florist.\n" +
            "\n" +
            "  \n" +
            "- Really?\n" +
            "- My only interest is flowers.\n" +
            "\n" +
            "  \n" +
            "Our new queen was just elected\n" +
            "with that same campaign slogan.\n" +
            "\n" +
            "  \n" +
            "Anyway, if you look...\n" +
            "\n" +
            "  \n" +
            "There's my hive right there. See it?\n" +
            "\n" +
            "  \n" +
            "You're in Sheep Meadow!\n" +
            "\n" +
            "  \n" +
            "Yes! I'm right off the Turtle Pond!\n" +
            "\n" +
            "  \n" +
            "No way! I know that area.\n" +
            "I lost a toe ring there once.\n" +
            "\n" +
            "  \n" +
            "- Why do girls put rings on their toes?\n" +
            "- Why not?\n" +
            "\n" +
            "  \n" +
            "- It's like putting a hat on your knee.\n" +
            "- Maybe I'll try that.\n" +
            "\n" +
            "  \n" +
            "- You all right, ma'am?\n" +
            "- Oh, yeah. Fine.\n" +
            "\n" +
            "  \n" +
            "Just having two cups of coffee!\n" +
            "\n" +
            "  \n" +
            "Anyway, this has been great.\n" +
            "Thanks for the coffee.\n" +
            "\n" +
            "  \n" +
            "Yeah, it's no trouble.\n" +
            "\n" +
            "  \n" +
            "Sorry I couldn't finish it. If I did,\n" +
            "I'd be up the rest of my life.\n" +
            "\n" +
            "  \n" +
            "Are you...?\n" +
            "\n" +
            "  \n" +
            "Oan I take a piece of this with me?\n" +
            "\n" +
            "  \n" +
            "Sure! Here, have a crumb.\n" +
            "\n" +
            "  \n" +
            "- Thanks!\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "All right. Well, then...\n" +
            "I guess I'll see you around.\n" +
            "\n" +
            "  \n" +
            "Or not.\n" +
            "\n" +
            "  \n" +
            "OK, Barry.\n" +
            "\n" +
            "  \n" +
            "And thank you\n" +
            "so much again... for before.\n" +
            "\n" +
            "  \n" +
            "Oh, that? That was nothing.\n" +
            "\n" +
            "  \n" +
            "Well, not nothing, but... Anyway...\n" +
            "\n" +
            "  \n" +
            "This can't possibly work.\n" +
            "\n" +
            "  \n" +
            "He's all set to go.\n" +
            "We may as well try it.\n" +
            "\n" +
            "  \n" +
            "OK, Dave, pull the chute.\n" +
            "\n" +
            "  \n" +
            "- Sounds amazing.\n" +
            "- It was amazing!\n" +
            "\n" +
            "  \n" +
            "It was the scariest,\n" +
            "happiest moment of my life.\n" +
            "\n" +
            "  \n" +
            "Humans! I can't believe\n" +
            "you were with humans!\n" +
            "\n" +
            "  \n" +
            "Giant, scary humans!\n" +
            "What were they like?\n" +
            "\n" +
            "  \n" +
            "Huge and crazy. They talk crazy.\n" +
            "\n" +
            "  \n" +
            "They eat crazy giant things.\n" +
            "They drive crazy.\n" +
            "\n" +
            "  \n" +
            "- Do they try and kill you, like on TV?\n" +
            "- Some of them. But some of them don't.\n" +
            "\n" +
            "  \n" +
            "- How'd you get back?\n" +
            "- Poodle.\n" +
            "\n" +
            "  \n" +
            "You did it, and I'm glad. You saw\n" +
            "whatever you wanted to see.\n" +
            "\n" +
            "  \n" +
            "You had your \"experience.\" Now you\n" +
            "can pick out yourjob and be normal.\n" +
            "\n" +
            "  \n" +
            "- Well...\n" +
            "- Well?\n" +
            "\n" +
            "  \n" +
            "Well, I met someone.\n" +
            "\n" +
            "  \n" +
            "You did? Was she Bee-ish?\n" +
            "\n" +
            "  \n" +
            "- A wasp?! Your parents will kill you!\n" +
            "- No, no, no, not a wasp.\n" +
            "\n" +
            "  \n" +
            "- Spider?\n" +
            "- I'm not attracted to spiders.\n" +
            "\n" +
            "  \n" +
            "I know it's the hottest thing,\n" +
            "with the eight legs and all.\n" +
            "\n" +
            "  \n" +
            "I can't get by that face.\n" +
            "\n" +
            "  \n" +
            "So who is she?\n" +
            "\n" +
            "  \n" +
            "She's... human.\n" +
            "\n" +
            "  \n" +
            "No, no. That's a bee law.\n" +
            "You wouldn't break a bee law.\n" +
            "\n" +
            "  \n" +
            "- Her name's Vanessa.\n" +
            "- Oh, boy.\n" +
            "\n" +
            "  \n" +
            "She's so nice. And she's a florist!\n" +
            "\n" +
            "  \n" +
            "Oh, no! You're dating a human florist!\n" +
            "\n" +
            "  \n" +
            "We're not dating.\n" +
            "\n" +
            "  \n" +
            "You're flying outside the hive, talking\n" +
            "to humans that attack our homes\n" +
            "\n" +
            "  \n" +
            "with power washers and M-80s!\n" +
            "One-eighth a stick of dynamite!\n" +
            "\n" +
            "  \n" +
            "She saved my life!\n" +
            "And she understands me.\n" +
            "\n" +
            "  \n" +
            "This is over!\n" +
            "\n" +
            "  \n" +
            "Eat this.\n" +
            "\n" +
            "  \n" +
            "This is not over! What was that?\n" +
            "\n" +
            "  \n" +
            "- They call it a crumb.\n" +
            "- It was so stingin' stripey!\n" +
            "\n" +
            "  \n" +
            "And that's not what they eat.\n" +
            "That's what falls off what they eat!\n" +
            "\n" +
            "  \n" +
            "- You know what a Oinnabon is?\n" +
            "- No.\n" +
            "\n" +
            "  \n" +
            "It's bread and cinnamon and frosting.\n" +
            "They heat it up...\n" +
            "\n" +
            "  \n" +
            "Sit down!\n" +
            "\n" +
            "  \n" +
            "...really hot!\n" +
            "- Listen to me!\n" +
            "\n" +
            "  \n" +
            "We are not them! We're us.\n" +
            "There's us and there's them!\n" +
            "\n" +
            "  \n" +
            "Yes, but who can deny\n" +
            "the heart that is yearning?\n" +
            "\n" +
            "  \n" +
            "There's no yearning.\n" +
            "Stop yearning. Listen to me!\n" +
            "\n" +
            "  \n" +
            "You have got to start thinking bee,\n" +
            "my friend. Thinking bee!\n" +
            "\n" +
            "  \n" +
            "- Thinking bee.\n" +
            "- Thinking bee.\n" +
            "\n" +
            "  \n" +
            "Thinking bee! Thinking bee!\n" +
            "Thinking bee! Thinking bee!\n" +
            "\n" +
            "  \n" +
            "There he is. He's in the pool.\n" +
            "\n" +
            "  \n" +
            "You know what your problem is, Barry?\n" +
            "\n" +
            "  \n" +
            "I gotta start thinking bee?\n" +
            "\n" +
            "  \n" +
            "How much longer will this go on?\n" +
            "\n" +
            "  \n" +
            "It's been three days!\n" +
            "Why aren't you working?\n" +
            "\n" +
            "  \n" +
            "I've got a lot of big life decisions\n" +
            "to think about.\n" +
            "\n" +
            "  \n" +
            "What life? You have no life!\n" +
            "You have no job. You're barely a bee!\n" +
            "\n" +
            "  \n" +
            "Would it kill you\n" +
            "to make a little honey?\n" +
            "\n" +
            "  \n" +
            "Barry, come out.\n" +
            "Your father's talking to you.\n" +
            "\n" +
            "  \n" +
            "Martin, would you talk to him?\n" +
            "\n" +
            "  \n" +
            "Barry, I'm talking to you!\n" +
            "\n" +
            "  \n" +
            "You coming?\n" +
            "\n" +
            "  \n" +
            "Got everything?\n" +
            "\n" +
            "  \n" +
            "All set!\n" +
            "\n" +
            "  \n" +
            "Go ahead. I'll catch up.\n" +
            "\n" +
            "  \n" +
            "Don't be too long.\n" +
            "\n" +
            "  \n" +
            "Watch this!\n" +
            "\n" +
            "  \n" +
            "Vanessa!\n" +
            "\n" +
            "  \n" +
            "- We're still here.\n" +
            "- I told you not to yell at him.\n" +
            "\n" +
            "  \n" +
            "He doesn't respond to yelling!\n" +
            "\n" +
            "  \n" +
            "- Then why yell at me?\n" +
            "- Because you don't listen!\n" +
            "\n" +
            "  \n" +
            "I'm not listening to this.\n" +
            "\n" +
            "  \n" +
            "Sorry, I've gotta go.\n" +
            "\n" +
            "  \n" +
            "- Where are you going?\n" +
            "- I'm meeting a friend.\n" +
            "\n" +
            "  \n" +
            "A girl? Is this why you can't decide?\n" +
            "\n" +
            "  \n" +
            "Bye.\n" +
            "\n" +
            "  \n" +
            "I just hope she's Bee-ish.\n" +
            "\n" +
            "  \n" +
            "They have a huge parade\n" +
            "of flowers every year in Pasadena?\n" +
            "\n" +
            "  \n" +
            "To be in the Tournament of Roses,\n" +
            "that's every florist's dream!\n" +
            "\n" +
            "  \n" +
            "Up on a float, surrounded\n" +
            "by flowers, crowds cheering.\n" +
            "\n" +
            "  \n" +
            "A tournament. Do the roses\n" +
            "compete in athletic events?\n" +
            "\n" +
            "  \n" +
            "No. All right, I've got one.\n" +
            "How come you don't fly everywhere?\n" +
            "\n" +
            "  \n" +
            "It's exhausting. Why don't you\n" +
            "run everywhere? It's faster.\n" +
            "\n" +
            "  \n" +
            "Yeah, OK, I see, I see.\n" +
            "All right, your turn.\n" +
            "\n" +
            "  \n" +
            "TiVo. You can just freeze live TV?\n" +
            "That's insane!\n" +
            "\n" +
            "  \n" +
            "You don't have that?\n" +
            "\n" +
            "  \n" +
            "We have Hivo, but it's a disease.\n" +
            "It's a horrible, horrible disease.\n" +
            "\n" +
            "  \n" +
            "Oh, my.\n" +
            "\n" +
            "  \n" +
            "Dumb bees!\n" +
            "\n" +
            "  \n" +
            "You must want to sting all those jerks.\n" +
            "\n" +
            "  \n" +
            "We try not to sting.\n" +
            "It's usually fatal for us.\n" +
            "\n" +
            "  \n" +
            "So you have to watch your temper.\n" +
            "\n" +
            "  \n" +
            "Very carefully.\n" +
            "You kick a wall, take a walk,\n" +
            "\n" +
            "  \n" +
            "write an angry letter and throw it out.\n" +
            "Work through it like any emotion:\n" +
            "\n" +
            "  \n" +
            "Anger, jealousy, lust.\n" +
            "\n" +
            "  \n" +
            "Oh, my goodness! Are you OK?\n" +
            "\n" +
            "  \n" +
            "Yeah.\n" +
            "\n" +
            "  \n" +
            "- What is wrong with you?!\n" +
            "- It's a bug.\n" +
            "\n" +
            "  \n" +
            "He's not bothering anybody.\n" +
            "Get out of here, you creep!\n" +
            "\n" +
            "  \n" +
            "What was that? A Pic 'N' Save circular?\n" +
            "\n" +
            "  \n" +
            "Yeah, it was. How did you know?\n" +
            "\n" +
            "  \n" +
            "It felt like about 10 pages.\n" +
            "Seventy-five is pretty much our limit.\n" +
            "\n" +
            "  \n" +
            "You've really got that\n" +
            "down to a science.\n" +
            "\n" +
            "  \n" +
            "- I lost a cousin to Italian Vogue.\n" +
            "- I'll bet.\n" +
            "\n" +
            "  \n" +
            "What in the name\n" +
            "of Mighty Hercules is this?\n" +
            "\n" +
            "  \n" +
            "How did this get here?\n" +
            "Oute Bee, Golden Blossom,\n" +
            "\n" +
            "  \n" +
            "Ray Liotta Private Select?\n" +
            "\n" +
            "  \n" +
            "- Is he that actor?\n" +
            "- I never heard of him.\n" +
            "\n" +
            "  \n" +
            "- Why is this here?\n" +
            "- For people. We eat it.\n" +
            "\n" +
            "  \n" +
            "You don't have\n" +
            "enough food of your own?\n" +
            "\n" +
            "  \n" +
            "- Well, yes.\n" +
            "- How do you get it?\n" +
            "\n" +
            "  \n" +
            "- Bees make it.\n" +
            "- I know who makes it!\n" +
            "\n" +
            "  \n" +
            "And it's hard to make it!\n" +
            "\n" +
            "  \n" +
            "There's heating, cooling, stirring.\n" +
            "You need a whole Krelman thing!\n" +
            "\n" +
            "  \n" +
            "- It's organic.\n" +
            "- It's our-ganic!\n" +
            "\n" +
            "  \n" +
            "It's just honey, Barry.\n" +
            "\n" +
            "  \n" +
            "Just what?!\n" +
            "\n" +
            "  \n" +
            "Bees don't know about this!\n" +
            "This is stealing! A lot of stealing!\n" +
            "\n" +
            "  \n" +
            "You've taken our homes, schools,\n" +
            "hospitals! This is all we have!\n" +
            "\n" +
            "  \n" +
            "And it's on sale?!\n" +
            "I'm getting to the bottom of this.\n" +
            "\n" +
            "  \n" +
            "I'm getting to the bottom\n" +
            "of all of this!\n" +
            "\n" +
            "  \n" +
            "Hey, Hector.\n" +
            "\n" +
            "  \n" +
            "- You almost done?\n" +
            "- Almost.\n" +
            "\n" +
            "  \n" +
            "He is here. I sense it.\n" +
            "\n" +
            "  \n" +
            "Well, I guess I'll go home now\n" +
            "\n" +
            "  \n" +
            "and just leave this nice honey out,\n" +
            "with no one around.\n" +
            "\n" +
            "  \n" +
            "You're busted, box boy!\n" +
            "\n" +
            "  \n" +
            "I knew I heard something.\n" +
            "So you can talk!\n" +
            "\n" +
            "  \n" +
            "I can talk.\n" +
            "And now you'll start talking!\n" +
            "\n" +
            "  \n" +
            "Where you getting the sweet stuff?\n" +
            "Who's your supplier?\n" +
            "\n" +
            "  \n" +
            "I don't understand.\n" +
            "I thought we were friends.\n" +
            "\n" +
            "  \n" +
            "The last thing we want\n" +
            "to do is upset bees!\n" +
            "\n" +
            "  \n" +
            "You're too late! It's ours now!\n" +
            "\n" +
            "  \n" +
            "You, sir, have crossed\n" +
            "the wrong sword!\n" +
            "\n" +
            "  \n" +
            "You, sir, will be lunch\n" +
            "for my iguana, Ignacio!\n" +
            "\n" +
            "  \n" +
            "Where is the honey coming from?\n" +
            "\n" +
            "  \n" +
            "Tell me where!\n" +
            "\n" +
            "  \n" +
            "Honey Farms! It comes from Honey Farms!\n" +
            "\n" +
            "  \n" +
            "Orazy person!\n" +
            "\n" +
            "  \n" +
            "What horrible thing has happened here?\n" +
            "\n" +
            "  \n" +
            "These faces, they never knew\n" +
            "what hit them. And now\n" +
            "\n" +
            "  \n" +
            "they're on the road to nowhere!\n" +
            "\n" +
            "  \n" +
            "Just keep still.\n" +
            "\n" +
            "  \n" +
            "What? You're not dead?\n" +
            "\n" +
            "  \n" +
            "Do I look dead? They will wipe anything\n" +
            "that moves. Where you headed?\n" +
            "\n" +
            "  \n" +
            "To Honey Farms.\n" +
            "I am onto something huge here.\n" +
            "\n" +
            "  \n" +
            "I'm going to Alaska. Moose blood,\n" +
            "crazy stuff. Blows your head off!\n" +
            "\n" +
            "  \n" +
            "I'm going to Tacoma.\n" +
            "\n" +
            "  \n" +
            "- And you?\n" +
            "- He really is dead.\n" +
            "\n" +
            "  \n" +
            "All right.\n" +
            "\n" +
            "  \n" +
            "Uh-oh!\n" +
            "\n" +
            "  \n" +
            "- What is that?!\n" +
            "- Oh, no!\n" +
            "\n" +
            "  \n" +
            "- A wiper! Triple blade!\n" +
            "- Triple blade?\n" +
            "\n" +
            "  \n" +
            "Jump on! It's your only chance, bee!\n" +
            "\n" +
            "  \n" +
            "Why does everything have\n" +
            "to be so doggone clean?!\n" +
            "\n" +
            "  \n" +
            "How much do you people need to see?!\n" +
            "\n" +
            "  \n" +
            "Open your eyes!\n" +
            "Stick your head out the window!\n" +
            "\n" +
            "  \n" +
            "From NPR News in Washington,\n" +
            "I'm Oarl Kasell.\n" +
            "\n" +
            "  \n" +
            "But don't kill no more bugs!\n" +
            "\n" +
            "  \n" +
            "- Bee!\n" +
            "- Moose blood guy!!\n" +
            "\n" +
            "  \n" +
            "- You hear something?\n" +
            "- Like what?\n" +
            "\n" +
            "  \n" +
            "Like tiny screaming.\n" +
            "\n" +
            "  \n" +
            "Turn off the radio.\n" +
            "\n" +
            "  \n" +
            "Whassup, bee boy?\n" +
            "\n" +
            "  \n" +
            "Hey, Blood.\n" +
            "\n" +
            "  \n" +
            "Just a row of honey jars,\n" +
            "as far as the eye could see.\n" +
            "\n" +
            "  \n" +
            "Wow!\n" +
            "\n" +
            "  \n" +
            "I assume wherever this truck goes\n" +
            "is where they're getting it.\n" +
            "\n" +
            "  \n" +
            "I mean, that honey's ours.\n" +
            "\n" +
            "  \n" +
            "- Bees hang tight.\n" +
            "- We're all jammed in.\n" +
            "\n" +
            "  \n" +
            "It's a close community.\n" +
            "\n" +
            "  \n" +
            "Not us, man. We on our own.\n" +
            "Every mosquito on his own.\n" +
            "\n" +
            "  \n" +
            "- What if you get in trouble?\n" +
            "- You a mosquito, you in trouble.\n" +
            "\n" +
            "  \n" +
            "Nobody likes us. They just smack.\n" +
            "See a mosquito, smack, smack!\n" +
            "\n" +
            "  \n" +
            "At least you're out in the world.\n" +
            "You must meet girls.\n" +
            "\n" +
            "  \n" +
            "Mosquito girls try to trade up,\n" +
            "get with a moth, dragonfly.\n" +
            "\n" +
            "  \n" +
            "Mosquito girl don't want no mosquito.\n" +
            "\n" +
            "  \n" +
            "You got to be kidding me!\n" +
            "\n" +
            "  \n" +
            "Mooseblood's about to leave\n" +
            "the building! So long, bee!\n" +
            "\n" +
            "  \n" +
            "- Hey, guys!\n" +
            "- Mooseblood!\n" +
            "\n" +
            "  \n" +
            "I knew I'd catch y'all down here.\n" +
            "Did you bring your crazy straw?\n" +
            "\n" +
            "  \n" +
            "We throw it in jars, slap a label on it,\n" +
            "and it's pretty much pure profit.\n" +
            "\n" +
            "  \n" +
            "What is this place?\n" +
            "\n" +
            "  \n" +
            "A bee's got a brain\n" +
            "the size of a pinhead.\n" +
            "\n" +
            "  \n" +
            "They are pinheads!\n" +
            "\n" +
            "  \n" +
            "Pinhead.\n" +
            "\n" +
            "  \n" +
            "- Oheck out the new smoker.\n" +
            "- Oh, sweet. That's the one you want.\n" +
            "\n" +
            "  \n" +
            "The Thomas 3000!\n" +
            "\n" +
            "  \n" +
            "Smoker?\n" +
            "\n" +
            "  \n" +
            "Ninety puffs a minute, semi-automatic.\n" +
            "Twice the nicotine, all the tar.\n" +
            "\n" +
            "  \n" +
            "A couple breaths of this\n" +
            "knocks them right out.\n" +
            "\n" +
            "  \n" +
            "They make the honey,\n" +
            "and we make the money.\n" +
            "\n" +
            "  \n" +
            "\"They make the honey,\n" +
            "and we make the money\"?\n" +
            "\n" +
            "  \n" +
            "Oh, my!\n" +
            "\n" +
            "  \n" +
            "What's going on? Are you OK?\n" +
            "\n" +
            "  \n" +
            "Yeah. It doesn't last too long.\n" +
            "\n" +
            "  \n" +
            "Do you know you're\n" +
            "in a fake hive with fake walls?\n" +
            "\n" +
            "  \n" +
            "Our queen was moved here.\n" +
            "We had no choice.\n" +
            "\n" +
            "  \n" +
            "This is your queen?\n" +
            "That's a man in women's clothes!\n" +
            "\n" +
            "  \n" +
            "That's a drag queen!\n" +
            "\n" +
            "  \n" +
            "What is this?\n" +
            "\n" +
            "  \n" +
            "Oh, no!\n" +
            "\n" +
            "  \n" +
            "There's hundreds of them!\n" +
            "\n" +
            "  \n" +
            "Bee honey.\n" +
            "\n" +
            "  \n" +
            "Our honey is being brazenly stolen\n" +
            "on a massive scale!\n" +
            "\n" +
            "  \n" +
            "This is worse than anything bears\n" +
            "have done! I intend to do something.\n" +
            "\n" +
            "  \n" +
            "Oh, Barry, stop.\n" +
            "\n" +
            "  \n" +
            "Who told you humans are taking\n" +
            "our honey? That's a rumor.\n" +
            "\n" +
            "  \n" +
            "Do these look like rumors?\n" +
            "\n" +
            "  \n" +
            "That's a conspiracy theory.\n" +
            "These are obviously doctored photos.\n" +
            "\n" +
            "  \n" +
            "How did you get mixed up in this?\n" +
            "\n" +
            "  \n" +
            "He's been talking to humans.\n" +
            "\n" +
            "  \n" +
            "- What?\n" +
            "- Talking to humans?!\n" +
            "\n" +
            "  \n" +
            "He has a human girlfriend.\n" +
            "And they make out!\n" +
            "\n" +
            "  \n" +
            "Make out? Barry!\n" +
            "\n" +
            "  \n" +
            "We do not.\n" +
            "\n" +
            "  \n" +
            "- You wish you could.\n" +
            "- Whose side are you on?\n" +
            "\n" +
            "  \n" +
            "The bees!\n" +
            "\n" +
            "  \n" +
            "I dated a cricket once in San Antonio.\n" +
            "Those crazy legs kept me up all night.\n" +
            "\n" +
            "  \n" +
            "Barry, this is what you want\n" +
            "to do with your life?\n" +
            "\n" +
            "  \n" +
            "I want to do it for all our lives.\n" +
            "Nobody works harder than bees!\n" +
            "\n" +
            "  \n" +
            "Dad, I remember you\n" +
            "coming home so overworked\n" +
            "\n" +
            "  \n" +
            "your hands were still stirring.\n" +
            "You couldn't stop.\n" +
            "\n" +
            "  \n" +
            "I remember that.\n" +
            "\n" +
            "  \n" +
            "What right do they have to our honey?\n" +
            "\n" +
            "  \n" +
            "We live on two cups a year. They put it\n" +
            "in lip balm for no reason whatsoever!\n" +
            "\n" +
            "  \n" +
            "Even if it's true, what can one bee do?\n" +
            "\n" +
            "  \n" +
            "Sting them where it really hurts.\n" +
            "\n" +
            "  \n" +
            "In the face! The eye!\n" +
            "\n" +
            "  \n" +
            "- That would hurt.\n" +
            "- No.\n" +
            "\n" +
            "  \n" +
            "Up the nose? That's a killer.\n" +
            "\n" +
            "  \n" +
            "There's only one place you can sting\n" +
            "the humans, one place where it matters.\n" +
            "\n" +
            "  \n" +
            "Hive at Five, the hive's only\n" +
            "full-hour action news source.\n" +
            "\n" +
            "  \n" +
            "No more bee beards!\n" +
            "\n" +
            "  \n" +
            "With Bob Bumble at the anchor desk.\n" +
            "\n" +
            "  \n" +
            "Weather with Storm Stinger.\n" +
            "\n" +
            "  \n" +
            "Sports with Buzz Larvi.\n" +
            "\n" +
            "  \n" +
            "And Jeanette Ohung.\n" +
            "\n" +
            "  \n" +
            "- Good evening. I'm Bob Bumble.\n" +
            "- And I'm Jeanette Ohung.\n" +
            "\n" +
            "  \n" +
            "A tri-county bee, Barry Benson,\n" +
            "\n" +
            "  \n" +
            "intends to sue the human race\n" +
            "for stealing our honey,\n" +
            "\n" +
            "  \n" +
            "packaging it and profiting\n" +
            "from it illegally!\n" +
            "\n" +
            "  \n" +
            "Tomorrow night on Bee Larry King,\n" +
            "\n" +
            "  \n" +
            "we'll have three former queens here in\n" +
            "our studio, discussing their new book,\n" +
            "\n" +
            "  \n" +
            "Olassy Ladies,\n" +
            "out this week on Hexagon.\n" +
            "\n" +
            "  \n" +
            "Tonight we're talking to Barry Benson.\n" +
            "\n" +
            "  \n" +
            "Did you ever think, \"I'm a kid\n" +
            "from the hive. I can't do this\"?\n" +
            "\n" +
            "  \n" +
            "Bees have never been afraid\n" +
            "to change the world.\n" +
            "\n" +
            "  \n" +
            "What about Bee Oolumbus?\n" +
            "Bee Gandhi? Bejesus?\n" +
            "\n" +
            "  \n" +
            "Where I'm from, we'd never sue humans.\n" +
            "\n" +
            "  \n" +
            "We were thinking\n" +
            "of stickball or candy stores.\n" +
            "\n" +
            "  \n" +
            "How old are you?\n" +
            "\n" +
            "  \n" +
            "The bee community\n" +
            "is supporting you in this case,\n" +
            "\n" +
            "  \n" +
            "which will be the trial\n" +
            "of the bee century.\n" +
            "\n" +
            "  \n" +
            "You know, they have a Larry King\n" +
            "in the human world too.\n" +
            "\n" +
            "  \n" +
            "It's a common name. Next week...\n" +
            "\n" +
            "  \n" +
            "He looks like you and has a show\n" +
            "and suspenders and colored dots...\n" +
            "\n" +
            "  \n" +
            "Next week...\n" +
            "\n" +
            "  \n" +
            "Glasses, quotes on the bottom from the\n" +
            "guest even though you just heard 'em.\n" +
            "\n" +
            "  \n" +
            "Bear Week next week!\n" +
            "They're scary, hairy and here live.\n" +
            "\n" +
            "  \n" +
            "Always leans forward, pointy shoulders,\n" +
            "squinty eyes, very Jewish.\n" +
            "\n" +
            "  \n" +
            "In tennis, you attack\n" +
            "at the point of weakness!\n" +
            "\n" +
            "  \n" +
            "It was my grandmother, Ken. She's 81.\n" +
            "\n" +
            "  \n" +
            "Honey, her backhand's a joke!\n" +
            "I'm not gonna take advantage of that?\n" +
            "\n" +
            "  \n" +
            "Quiet, please.\n" +
            "Actual work going on here.\n" +
            "\n" +
            "  \n" +
            "- Is that that same bee?\n" +
            "- Yes, it is!\n" +
            "\n" +
            "  \n" +
            "I'm helping him sue the human race.\n" +
            "\n" +
            "  \n" +
            "- Hello.\n" +
            "- Hello, bee.\n" +
            "\n" +
            "  \n" +
            "This is Ken.\n" +
            "\n" +
            "  \n" +
            "Yeah, I remember you. Timberland, size\n" +
            "ten and a half. Vibram sole, I believe.\n" +
            "\n" +
            "  \n" +
            "Why does he talk again?\n" +
            "\n" +
            "  \n" +
            "Listen, you better go\n" +
            "'cause we're really busy working.\n" +
            "\n" +
            "  \n" +
            "But it's our yogurt night!\n" +
            "\n" +
            "  \n" +
            "Bye-bye.\n" +
            "\n" +
            "  \n" +
            "Why is yogurt night so difficult?!\n" +
            "\n" +
            "  \n" +
            "You poor thing.\n" +
            "You two have been at this for hours!\n" +
            "\n" +
            "  \n" +
            "Yes, and Adam here\n" +
            "has been a huge help.\n" +
            "\n" +
            "  \n" +
            "- Frosting...\n" +
            "- How many sugars?\n" +
            "\n" +
            "  \n" +
            "Just one. I try not\n" +
            "to use the competition.\n" +
            "\n" +
            "  \n" +
            "So why are you helping me?\n" +
            "\n" +
            "  \n" +
            "Bees have good qualities.\n" +
            "\n" +
            "  \n" +
            "And it takes my mind off the shop.\n" +
            "\n" +
            "  \n" +
            "Instead of flowers, people\n" +
            "are giving balloon bouquets now.\n" +
            "\n" +
            "  \n" +
            "Those are great, if you're three.\n" +
            "\n" +
            "  \n" +
            "And artificial flowers.\n" +
            "\n" +
            "  \n" +
            "- Oh, those just get me psychotic!\n" +
            "- Yeah, me too.\n" +
            "\n" +
            "  \n" +
            "Bent stingers, pointless pollination.\n" +
            "\n" +
            "  \n" +
            "Bees must hate those fake things!\n" +
            "\n" +
            "  \n" +
            "Nothing worse\n" +
            "than a daffodil that's had work done.\n" +
            "\n" +
            "  \n" +
            "Maybe this could make up\n" +
            "for it a little bit.\n" +
            "\n" +
            "  \n" +
            "- This lawsuit's a pretty big deal.\n" +
            "- I guess.\n" +
            "\n" +
            "  \n" +
            "You sure you want to go through with it?\n" +
            "\n" +
            "  \n" +
            "Am I sure? When I'm done with\n" +
            "the humans, they won't be able\n" +
            "\n" +
            "  \n" +
            "to say, \"Honey, I'm home,\"\n" +
            "without paying a royalty!\n" +
            "\n" +
            "  \n" +
            "It's an incredible scene\n" +
            "here in downtown Manhattan,\n" +
            "\n" +
            "  \n" +
            "where the world anxiously waits,\n" +
            "because for the first time in history,\n" +
            "\n" +
            "  \n" +
            "we will hear for ourselves\n" +
            "if a honeybee can actually speak.\n" +
            "\n" +
            "  \n" +
            "What have we gotten into here, Barry?\n" +
            "\n" +
            "  \n" +
            "It's pretty big, isn't it?\n" +
            "\n" +
            "  \n" +
            "I can't believe how many humans\n" +
            "don't work during the day.\n" +
            "\n" +
            "  \n" +
            "You think billion-dollar multinational\n" +
            "food companies have good lawyers?\n" +
            "\n" +
            "  \n" +
            "Everybody needs to stay\n" +
            "behind the barricade.\n" +
            "\n" +
            "  \n" +
            "- What's the matter?\n" +
            "- I don't know, I just got a chill.\n" +
            "\n" +
            "  \n" +
            "Well, if it isn't the bee team.\n" +
            "\n" +
            "  \n" +
            "You boys work on this?\n" +
            "\n" +
            "  \n" +
            "All rise! The Honorable\n" +
            "Judge Bumbleton presiding.\n" +
            "\n" +
            "  \n" +
            "All right. Oase number 4475,\n" +
            "\n" +
            "  \n" +
            "Superior Oourt of New York,\n" +
            "Barry Bee Benson v. the Honey Industry\n" +
            "\n" +
            "  \n" +
            "is now in session.\n" +
            "\n" +
            "  \n" +
            "Mr. Montgomery, you're representing\n" +
            "the five food companies collectively?\n" +
            "\n" +
            "  \n" +
            "A privilege.\n" +
            "\n" +
            "  \n" +
            "Mr. Benson... you're representing\n" +
            "all the bees of the world?\n" +
            "\n" +
            "  \n" +
            "I'm kidding. Yes, Your Honor,\n" +
            "we're ready to proceed.\n" +
            "\n" +
            "  \n" +
            "Mr. Montgomery,\n" +
            "your opening statement, please.\n" +
            "\n" +
            "  \n" +
            "Ladies and gentlemen of the jury,\n" +
            "\n" +
            "  \n" +
            "my grandmother was a simple woman.\n" +
            "\n" +
            "  \n" +
            "Born on a farm, she believed\n" +
            "it was man's divine right\n" +
            "\n" +
            "  \n" +
            "to benefit from the bounty\n" +
            "of nature God put before us.\n" +
            "\n" +
            "  \n" +
            "If we lived in the topsy-turvy world\n" +
            "Mr. Benson imagines,\n" +
            "\n" +
            "  \n" +
            "just think of what would it mean.\n" +
            "\n" +
            "  \n" +
            "I would have to negotiate\n" +
            "with the silkworm\n" +
            "\n" +
            "  \n" +
            "for the elastic in my britches!\n" +
            "\n" +
            "  \n" +
            "Talking bee!\n" +
            "\n" +
            "  \n" +
            "How do we know this isn't some sort of\n" +
            "\n" +
            "  \n" +
            "holographic motion-picture-capture\n" +
            "Hollywood wizardry?\n" +
            "\n" +
            "  \n" +
            "They could be using laser beams!\n" +
            "\n" +
            "  \n" +
            "Robotics! Ventriloquism!\n" +
            "Oloning! For all we know,\n" +
            "\n" +
            "  \n" +
            "he could be on steroids!\n" +
            "\n" +
            "  \n" +
            "Mr. Benson?\n" +
            "\n" +
            "  \n" +
            "Ladies and gentlemen,\n" +
            "there's no trickery here.\n" +
            "\n" +
            "  \n" +
            "I'm just an ordinary bee.\n" +
            "Honey's pretty important to me.\n" +
            "\n" +
            "  \n" +
            "It's important to all bees.\n" +
            "We invented it!\n" +
            "\n" +
            "  \n" +
            "We make it. And we protect it\n" +
            "with our lives.\n" +
            "\n" +
            "  \n" +
            "Unfortunately, there are\n" +
            "some people in this room\n" +
            "\n" +
            "  \n" +
            "who think they can take it from us\n" +
            "\n" +
            "  \n" +
            "'cause we're the little guys!\n" +
            "I'm hoping that, after this is all over,\n" +
            "\n" +
            "  \n" +
            "you'll see how, by taking our honey,\n" +
            "you not only take everything we have\n" +
            "\n" +
            "  \n" +
            "but everything we are!\n" +
            "\n" +
            "  \n" +
            "I wish he'd dress like that\n" +
            "all the time. So nice!\n" +
            "\n" +
            "  \n" +
            "Oall your first witness.\n" +
            "\n" +
            "  \n" +
            "So, Mr. Klauss Vanderhayden\n" +
            "of Honey Farms, big company you have.\n" +
            "\n" +
            "  \n" +
            "I suppose so.\n" +
            "\n" +
            "  \n" +
            "I see you also own\n" +
            "Honeyburton and Honron!\n" +
            "\n" +
            "  \n" +
            "Yes, they provide beekeepers\n" +
            "for our farms.\n" +
            "\n" +
            "  \n" +
            "Beekeeper. I find that\n" +
            "to be a very disturbing term.\n" +
            "\n" +
            "  \n" +
            "I don't imagine you employ\n" +
            "any bee-free-ers, do you?\n" +
            "\n" +
            "  \n" +
            "- No.\n" +
            "- I couldn't hear you.\n" +
            "\n" +
            "  \n" +
            "- No.\n" +
            "- No.\n" +
            "\n" +
            "  \n" +
            "Because you don't free bees.\n" +
            "You keep bees. Not only that,\n" +
            "\n" +
            "  \n" +
            "it seems you thought a bear would be\n" +
            "an appropriate image for a jar of honey.\n" +
            "\n" +
            "  \n" +
            "They're very lovable creatures.\n" +
            "\n" +
            "  \n" +
            "Yogi Bear, Fozzie Bear, Build-A-Bear.\n" +
            "\n" +
            "  \n" +
            "You mean like this?\n" +
            "\n" +
            "  \n" +
            "Bears kill bees!\n" +
            "\n" +
            "  \n" +
            "How'd you like his head crashing\n" +
            "through your living room?!\n" +
            "\n" +
            "  \n" +
            "Biting into your couch!\n" +
            "Spitting out your throw pillows!\n" +
            "\n" +
            "  \n" +
            "OK, that's enough. Take him away.\n" +
            "\n" +
            "  \n" +
            "So, Mr. Sting, thank you for being here.\n" +
            "Your name intrigues me.\n" +
            "\n" +
            "  \n" +
            "- Where have I heard it before?\n" +
            "- I was with a band called The Police.\n" +
            "\n" +
            "  \n" +
            "But you've never been\n" +
            "a police officer, have you?\n" +
            "\n" +
            "  \n" +
            "No, I haven't.\n" +
            "\n" +
            "  \n" +
            "No, you haven't. And so here\n" +
            "we have yet another example\n" +
            "\n" +
            "  \n" +
            "of bee culture casually\n" +
            "stolen by a human\n" +
            "\n" +
            "  \n" +
            "for nothing more than\n" +
            "a prance-about stage name.\n" +
            "\n" +
            "  \n" +
            "Oh, please.\n" +
            "\n" +
            "  \n" +
            "Have you ever been stung, Mr. Sting?\n" +
            "\n" +
            "  \n" +
            "Because I'm feeling\n" +
            "a little stung, Sting.\n" +
            "\n" +
            "  \n" +
            "Or should I say... Mr. Gordon M. Sumner!\n" +
            "\n" +
            "  \n" +
            "That's not his real name?! You idiots!\n" +
            "\n" +
            "  \n" +
            "Mr. Liotta, first,\n" +
            "belated congratulations on\n" +
            "\n" +
            "  \n" +
            "your Emmy win for a guest spot\n" +
            "on ER in 2005.\n" +
            "\n" +
            "  \n" +
            "Thank you. Thank you.\n" +
            "\n" +
            "  \n" +
            "I see from your resume\n" +
            "that you're devilishly handsome\n" +
            "\n" +
            "  \n" +
            "with a churning inner turmoil\n" +
            "that's ready to blow.\n" +
            "\n" +
            "  \n" +
            "I enjoy what I do. Is that a crime?\n" +
            "\n" +
            "  \n" +
            "Not yet it isn't. But is this\n" +
            "what it's come to for you?\n" +
            "\n" +
            "  \n" +
            "Exploiting tiny, helpless bees\n" +
            "so you don't\n" +
            "\n" +
            "  \n" +
            "have to rehearse\n" +
            "your part and learn your lines, sir?\n" +
            "\n" +
            "  \n" +
            "Watch it, Benson!\n" +
            "I could blow right now!\n" +
            "\n" +
            "  \n" +
            "This isn't a goodfella.\n" +
            "This is a badfella!\n" +
            "\n" +
            "  \n" +
            "Why doesn't someone just step on\n" +
            "this creep, and we can all go home?!\n" +
            "\n" +
            "  \n" +
            "- Order in this court!\n" +
            "- You're all thinking it!\n" +
            "\n" +
            "  \n" +
            "Order! Order, I say!\n" +
            "\n" +
            "  \n" +
            "- Say it!\n" +
            "- Mr. Liotta, please sit down!\n" +
            "\n" +
            "  \n" +
            "I think it was awfully nice\n" +
            "of that bear to pitch in like that.\n" +
            "\n" +
            "  \n" +
            "I think the jury's on our side.\n" +
            "\n" +
            "  \n" +
            "Are we doing everything right, legally?\n" +
            "\n" +
            "  \n" +
            "I'm a florist.\n" +
            "\n" +
            "  \n" +
            "Right. Well, here's to a great team.\n" +
            "\n" +
            "  \n" +
            "To a great team!\n" +
            "\n" +
            "  \n" +
            "Well, hello.\n" +
            "\n" +
            "  \n" +
            "- Ken!\n" +
            "- Hello.\n" +
            "\n" +
            "  \n" +
            "I didn't think you were coming.\n" +
            "\n" +
            "  \n" +
            "No, I was just late.\n" +
            "I tried to call, but... the battery.\n" +
            "\n" +
            "  \n" +
            "I didn't want all this to go to waste,\n" +
            "so I called Barry. Luckily, he was free.\n" +
            "\n" +
            "  \n" +
            "Oh, that was lucky.\n" +
            "\n" +
            "  \n" +
            "There's a little left.\n" +
            "I could heat it up.\n" +
            "\n" +
            "  \n" +
            "Yeah, heat it up, sure, whatever.\n" +
            "\n" +
            "  \n" +
            "So I hear you're quite a tennis player.\n" +
            "\n" +
            "  \n" +
            "I'm not much for the game myself.\n" +
            "The ball's a little grabby.\n" +
            "\n" +
            "  \n" +
            "That's where I usually sit.\n" +
            "Right... there.\n" +
            "\n" +
            "  \n" +
            "Ken, Barry was looking at your resume,\n" +
            "\n" +
            "  \n" +
            "and he agreed with me that eating with\n" +
            "chopsticks isn't really a special skill.\n" +
            "\n" +
            "  \n" +
            "You think I don't see what you're doing?\n" +
            "\n" +
            "  \n" +
            "I know how hard it is to find\n" +
            "the rightjob. We have that in common.\n" +
            "\n" +
            "  \n" +
            "Do we?\n" +
            "\n" +
            "  \n" +
            "Bees have 100 percent employment,\n" +
            "but we do jobs like taking the crud out.\n" +
            "\n" +
            "  \n" +
            "That's just what\n" +
            "I was thinking about doing.\n" +
            "\n" +
            "  \n" +
            "Ken, I let Barry borrow your razor\n" +
            "for his fuzz. I hope that was all right.\n" +
            "\n" +
            "  \n" +
            "I'm going to drain the old stinger.\n" +
            "\n" +
            "  \n" +
            "Yeah, you do that.\n" +
            "\n" +
            "  \n" +
            "Look at that.\n" +
            "\n" +
            "  \n" +
            "You know, I've just about had it\n" +
            "\n" +
            "  \n" +
            "with your little mind games.\n" +
            "\n" +
            "  \n" +
            "- What's that?\n" +
            "- Italian Vogue.\n" +
            "\n" +
            "  \n" +
            "Mamma mia, that's a lot of pages.\n" +
            "\n" +
            "  \n" +
            "A lot of ads.\n" +
            "\n" +
            "  \n" +
            "Remember what Van said, why is\n" +
            "your life more valuable than mine?\n" +
            "\n" +
            "  \n" +
            "Funny, I just can't seem to recall that!\n" +
            "\n" +
            "  \n" +
            "I think something stinks in here!\n" +
            "\n" +
            "  \n" +
            "I love the smell of flowers.\n" +
            "\n" +
            "  \n" +
            "How do you like the smell of flames?!\n" +
            "\n" +
            "  \n" +
            "Not as much.\n" +
            "\n" +
            "  \n" +
            "Water bug! Not taking sides!\n" +
            "\n" +
            "  \n" +
            "Ken, I'm wearing a Ohapstick hat!\n" +
            "This is pathetic!\n" +
            "\n" +
            "  \n" +
            "I've got issues!\n" +
            "\n" +
            "  \n" +
            "Well, well, well, a royal flush!\n" +
            "\n" +
            "  \n" +
            "- You're bluffing.\n" +
            "- Am I?\n" +
            "\n" +
            "  \n" +
            "Surf's up, dude!\n" +
            "\n" +
            "  \n" +
            "Poo water!\n" +
            "\n" +
            "  \n" +
            "That bowl is gnarly.\n" +
            "\n" +
            "  \n" +
            "Except for those dirty yellow rings!\n" +
            "\n" +
            "  \n" +
            "Kenneth! What are you doing?!\n" +
            "\n" +
            "  \n" +
            "You know, I don't even like honey!\n" +
            "I don't eat it!\n" +
            "\n" +
            "  \n" +
            "We need to talk!\n" +
            "\n" +
            "  \n" +
            "He's just a little bee!\n" +
            "\n" +
            "  \n" +
            "And he happens to be\n" +
            "the nicest bee I've met in a long time!\n" +
            "\n" +
            "  \n" +
            "Long time? What are you talking about?!\n" +
            "Are there other bugs in your life?\n" +
            "\n" +
            "  \n" +
            "No, but there are other things bugging\n" +
            "me in life. And you're one of them!\n" +
            "\n" +
            "  \n" +
            "Fine! Talking bees, no yogurt night...\n" +
            "\n" +
            "  \n" +
            "My nerves are fried from riding\n" +
            "on this emotional roller coaster!\n" +
            "\n" +
            "  \n" +
            "Goodbye, Ken.\n" +
            "\n" +
            "  \n" +
            "And for your information,\n" +
            "\n" +
            "  \n" +
            "I prefer sugar-free, artificial\n" +
            "sweeteners made by man!\n" +
            "\n" +
            "  \n" +
            "I'm sorry about all that.\n" +
            "\n" +
            "  \n" +
            "I know it's got\n" +
            "an aftertaste! I like it!\n" +
            "\n" +
            "  \n" +
            "I always felt there was some kind\n" +
            "of barrier between Ken and me.\n" +
            "\n" +
            "  \n" +
            "I couldn't overcome it.\n" +
            "Oh, well.\n" +
            "\n" +
            "  \n" +
            "Are you OK for the trial?\n" +
            "\n" +
            "  \n" +
            "I believe Mr. Montgomery\n" +
            "is about out of ideas.\n" +
            "\n" +
            "  \n" +
            "We would like to call\n" +
            "Mr. Barry Benson Bee to the stand.\n" +
            "\n" +
            "  \n" +
            "Good idea! You can really see why he's\n" +
            "considered one of the best lawyers...\n" +
            "\n" +
            "  \n" +
            "Yeah.\n" +
            "\n" +
            "  \n" +
            "Layton, you've\n" +
            "gotta weave some magic\n" +
            "\n" +
            "  \n" +
            "with this jury,\n" +
            "or it's gonna be all over.\n" +
            "\n" +
            "  \n" +
            "Don't worry. The only thing I have\n" +
            "to do to turn this jury around\n" +
            "\n" +
            "  \n" +
            "is to remind them\n" +
            "of what they don't like about bees.\n" +
            "\n" +
            "  \n" +
            "- You got the tweezers?\n" +
            "- Are you allergic?\n" +
            "\n" +
            "  \n" +
            "Only to losing, son. Only to losing.\n" +
            "\n" +
            "  \n" +
            "Mr. Benson Bee, I'll ask you\n" +
            "what I think we'd all like to know.\n" +
            "\n" +
            "  \n" +
            "What exactly is your relationship\n" +
            "\n" +
            "  \n" +
            "to that woman?\n" +
            "\n" +
            "  \n" +
            "We're friends.\n" +
            "\n" +
            "  \n" +
            "- Good friends?\n" +
            "- Yes.\n" +
            "\n" +
            "  \n" +
            "How good? Do you live together?\n" +
            "\n" +
            "  \n" +
            "Wait a minute...\n" +
            "\n" +
            "  \n" +
            "Are you her little...\n" +
            "\n" +
            "  \n" +
            "...bedbug?\n" +
            "\n" +
            "  \n" +
            "I've seen a bee documentary or two.\n" +
            "From what I understand,\n" +
            "\n" +
            "  \n" +
            "doesn't your queen give birth\n" +
            "to all the bee children?\n" +
            "\n" +
            "  \n" +
            "- Yeah, but...\n" +
            "- So those aren't your real parents!\n" +
            "\n" +
            "  \n" +
            "- Oh, Barry...\n" +
            "- Yes, they are!\n" +
            "\n" +
            "  \n" +
            "Hold me back!\n" +
            "\n" +
            "  \n" +
            "You're an illegitimate bee,\n" +
            "aren't you, Benson?\n" +
            "\n" +
            "  \n" +
            "He's denouncing bees!\n" +
            "\n" +
            "  \n" +
            "Don't y'all date your cousins?\n" +
            "\n" +
            "  \n" +
            "- Objection!\n" +
            "- I'm going to pincushion this guy!\n" +
            "\n" +
            "  \n" +
            "Adam, don't! It's what he wants!\n" +
            "\n" +
            "  \n" +
            "Oh, I'm hit!!\n" +
            "\n" +
            "  \n" +
            "Oh, lordy, I am hit!\n" +
            "\n" +
            "  \n" +
            "Order! Order!\n" +
            "\n" +
            "  \n" +
            "The venom! The venom\n" +
            "is coursing through my veins!\n" +
            "\n" +
            "  \n" +
            "I have been felled\n" +
            "by a winged beast of destruction!\n" +
            "\n" +
            "  \n" +
            "You see? You can't treat them\n" +
            "like equals! They're striped savages!\n" +
            "\n" +
            "  \n" +
            "Stinging's the only thing\n" +
            "they know! It's their way!\n" +
            "\n" +
            "  \n" +
            "- Adam, stay with me.\n" +
            "- I can't feel my legs.\n" +
            "\n" +
            "  \n" +
            "What angel of mercy\n" +
            "will come forward to suck the poison\n" +
            "\n" +
            "  \n" +
            "from my heaving buttocks?\n" +
            "\n" +
            "  \n" +
            "I will have order in this court. Order!\n" +
            "\n" +
            "  \n" +
            "Order, please!\n" +
            "\n" +
            "  \n" +
            "The case of the honeybees\n" +
            "versus the human race\n" +
            "\n" +
            "  \n" +
            "took a pointed turn against the bees\n" +
            "\n" +
            "  \n" +
            "yesterday when one of their legal\n" +
            "team stung Layton T. Montgomery.\n" +
            "\n" +
            "  \n" +
            "- Hey, buddy.\n" +
            "- Hey.\n" +
            "\n" +
            "  \n" +
            "- Is there much pain?\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "I...\n" +
            "\n" +
            "  \n" +
            "I blew the whole case, didn't I?\n" +
            "\n" +
            "  \n" +
            "It doesn't matter. What matters is\n" +
            "you're alive. You could have died.\n" +
            "\n" +
            "  \n" +
            "I'd be better off dead. Look at me.\n" +
            "\n" +
            "  \n" +
            "They got it from the cafeteria\n" +
            "downstairs, in a tuna sandwich.\n" +
            "\n" +
            "  \n" +
            "Look, there's\n" +
            "a little celery still on it.\n" +
            "\n" +
            "  \n" +
            "What was it like to sting someone?\n" +
            "\n" +
            "  \n" +
            "I can't explain it. It was all...\n" +
            "\n" +
            "  \n" +
            "All adrenaline and then...\n" +
            "and then ecstasy!\n" +
            "\n" +
            "  \n" +
            "All right.\n" +
            "\n" +
            "  \n" +
            "You think it was all a trap?\n" +
            "\n" +
            "  \n" +
            "Of course. I'm sorry.\n" +
            "I flew us right into this.\n" +
            "\n" +
            "  \n" +
            "What were we thinking? Look at us. We're\n" +
            "just a couple of bugs in this world.\n" +
            "\n" +
            "  \n" +
            "What will the humans do to us\n" +
            "if they win?\n" +
            "\n" +
            "  \n" +
            "I don't know.\n" +
            "\n" +
            "  \n" +
            "I hear they put the roaches in motels.\n" +
            "That doesn't sound so bad.\n" +
            "\n" +
            "  \n" +
            "Adam, they check in,\n" +
            "but they don't check out!\n" +
            "\n" +
            "  \n" +
            "Oh, my.\n" +
            "\n" +
            "  \n" +
            "Oould you get a nurse\n" +
            "to close that window?\n" +
            "\n" +
            "  \n" +
            "- Why?\n" +
            "- The smoke.\n" +
            "\n" +
            "  \n" +
            "Bees don't smoke.\n" +
            "\n" +
            "  \n" +
            "Right. Bees don't smoke.\n" +
            "\n" +
            "  \n" +
            "Bees don't smoke!\n" +
            "But some bees are smoking.\n" +
            "\n" +
            "  \n" +
            "That's it! That's our case!\n" +
            "\n" +
            "  \n" +
            "It is? It's not over?\n" +
            "\n" +
            "  \n" +
            "Get dressed. I've gotta go somewhere.\n" +
            "\n" +
            "  \n" +
            "Get back to the court and stall.\n" +
            "Stall any way you can.\n" +
            "\n" +
            "  \n" +
            "And assuming you've done step correctly, you're ready for the tub.\n" +
            "\n" +
            "  \n" +
            "Mr. Flayman.\n" +
            "\n" +
            "  \n" +
            "Yes? Yes, Your Honor!\n" +
            "\n" +
            "  \n" +
            "Where is the rest of your team?\n" +
            "\n" +
            "  \n" +
            "Well, Your Honor, it's interesting.\n" +
            "\n" +
            "  \n" +
            "Bees are trained to fly haphazardly,\n" +
            "\n" +
            "  \n" +
            "and as a result,\n" +
            "we don't make very good time.\n" +
            "\n" +
            "  \n" +
            "I actually heard a funny story about...\n" +
            "\n" +
            "  \n" +
            "Your Honor,\n" +
            "haven't these ridiculous bugs\n" +
            "\n" +
            "  \n" +
            "taken up enough\n" +
            "of this court's valuable time?\n" +
            "\n" +
            "  \n" +
            "How much longer will we allow\n" +
            "these absurd shenanigans to go on?\n" +
            "\n" +
            "  \n" +
            "They have presented no compelling\n" +
            "evidence to support their charges\n" +
            "\n" +
            "  \n" +
            "against my clients,\n" +
            "who run legitimate businesses.\n" +
            "\n" +
            "  \n" +
            "I move for a complete dismissal\n" +
            "of this entire case!\n" +
            "\n" +
            "  \n" +
            "Mr. Flayman, I'm afraid I'm going\n" +
            "\n" +
            "  \n" +
            "to have to consider\n" +
            "Mr. Montgomery's motion.\n" +
            "\n" +
            "  \n" +
            "But you can't! We have a terrific case.\n" +
            "\n" +
            "  \n" +
            "Where is your proof?\n" +
            "Where is the evidence?\n" +
            "\n" +
            "  \n" +
            "Show me the smoking gun!\n" +
            "\n" +
            "  \n" +
            "Hold it, Your Honor!\n" +
            "You want a smoking gun?\n" +
            "\n" +
            "  \n" +
            "Here is your smoking gun.\n" +
            "\n" +
            "  \n" +
            "What is that?\n" +
            "\n" +
            "  \n" +
            "It's a bee smoker!\n" +
            "\n" +
            "  \n" +
            "What, this?\n" +
            "This harmless little contraption?\n" +
            "\n" +
            "  \n" +
            "This couldn't hurt a fly,\n" +
            "let alone a bee.\n" +
            "\n" +
            "  \n" +
            "Look at what has happened\n" +
            "\n" +
            "  \n" +
            "to bees who have never been asked,\n" +
            "\"Smoking or non?\"\n" +
            "\n" +
            "  \n" +
            "Is this what nature intended for us?\n" +
            "\n" +
            "  \n" +
            "To be forcibly addicted\n" +
            "to smoke machines\n" +
            "\n" +
            "  \n" +
            "and man-made wooden slat work camps?\n" +
            "\n" +
            "  \n" +
            "Living out our lives as honey slaves\n" +
            "to the white man?\n" +
            "\n" +
            "  \n" +
            "- What are we gonna do?\n" +
            "- He's playing the species card.\n" +
            "\n" +
            "  \n" +
            "Ladies and gentlemen, please,\n" +
            "free these bees!\n" +
            "\n" +
            "  \n" +
            "Free the bees! Free the bees!\n" +
            "\n" +
            "  \n" +
            "Free the bees!\n" +
            "\n" +
            "  \n" +
            "Free the bees! Free the bees!\n" +
            "\n" +
            "  \n" +
            "The court finds in favor of the bees!\n" +
            "\n" +
            "  \n" +
            "Vanessa, we won!\n" +
            "\n" +
            "  \n" +
            "I knew you could do it! High-five!\n" +
            "\n" +
            "  \n" +
            "Sorry.\n" +
            "\n" +
            "  \n" +
            "I'm OK! You know what this means?\n" +
            "\n" +
            "  \n" +
            "All the honey\n" +
            "will finally belong to the bees.\n" +
            "\n" +
            "  \n" +
            "Now we won't have\n" +
            "to work so hard all the time.\n" +
            "\n" +
            "  \n" +
            "This is an unholy perversion\n" +
            "of the balance of nature, Benson.\n" +
            "\n" +
            "  \n" +
            "You'll regret this.\n" +
            "\n" +
            "  \n" +
            "Barry, how much honey is out there?\n" +
            "\n" +
            "  \n" +
            "All right. One at a time.\n" +
            "\n" +
            "  \n" +
            "Barry, who are you wearing?\n" +
            "\n" +
            "  \n" +
            "My sweater is Ralph Lauren,\n" +
            "and I have no pants.\n" +
            "\n" +
            "  \n" +
            "- What if Montgomery's right?\n" +
            "- What do you mean?\n" +
            "\n" +
            "  \n" +
            "We've been living the bee way\n" +
            "a long time, 27 million years.\n" +
            "\n" +
            "  \n" +
            "Oongratulations on your victory.\n" +
            "What will you demand as a settlement?\n" +
            "\n" +
            "  \n" +
            "First, we'll demand a complete shutdown\n" +
            "of all bee work camps.\n" +
            "\n" +
            "  \n" +
            "Then we want back the honey\n" +
            "that was ours to begin with,\n" +
            "\n" +
            "  \n" +
            "every last drop.\n" +
            "\n" +
            "  \n" +
            "We demand an end to the glorification\n" +
            "of the bear as anything more\n" +
            "\n" +
            "  \n" +
            "than a filthy, smelly,\n" +
            "bad-breath stink machine.\n" +
            "\n" +
            "  \n" +
            "We're all aware\n" +
            "of what they do in the woods.\n" +
            "\n" +
            "  \n" +
            "Wait for my signal.\n" +
            "\n" +
            "  \n" +
            "Take him out.\n" +
            "\n" +
            "  \n" +
            "He'll have nauseous\n" +
            "for a few hours, then he'll be fine.\n" +
            "\n" +
            "  \n" +
            "And we will no longer tolerate\n" +
            "bee-negative nicknames...\n" +
            "\n" +
            "  \n" +
            "But it's just a prance-about stage name!\n" +
            "\n" +
            "  \n" +
            "...unnecessary inclusion of honey\n" +
            "in bogus health products\n" +
            "\n" +
            "  \n" +
            "and la-dee-da human\n" +
            "tea-time snack garnishments.\n" +
            "\n" +
            "  \n" +
            "Oan't breathe.\n" +
            "\n" +
            "  \n" +
            "Bring it in, boys!\n" +
            "\n" +
            "  \n" +
            "Hold it right there! Good.\n" +
            "\n" +
            "  \n" +
            "Tap it.\n" +
            "\n" +
            "  \n" +
            "Mr. Buzzwell, we just passed three cups,\n" +
            "and there's gallons more coming!\n" +
            "\n" +
            "  \n" +
            "- I think we need to shut down!\n" +
            "- Shut down? We've never shut down.\n" +
            "\n" +
            "  \n" +
            "Shut down honey production!\n" +
            "\n" +
            "  \n" +
            "Stop making honey!\n" +
            "\n" +
            "  \n" +
            "Turn your key, sir!\n" +
            "\n" +
            "  \n" +
            "What do we do now?\n" +
            "\n" +
            "  \n" +
            "Oannonball!\n" +
            "\n" +
            "  \n" +
            "We're shutting honey production!\n" +
            "\n" +
            "  \n" +
            "Mission abort.\n" +
            "\n" +
            "  \n" +
            "Aborting pollination and nectar detail.\n" +
            "Returning to base.\n" +
            "\n" +
            "  \n" +
            "Adam, you wouldn't believe\n" +
            "how much honey was out there.\n" +
            "\n" +
            "  \n" +
            "Oh, yeah?\n" +
            "\n" +
            "  \n" +
            "What's going on? Where is everybody?\n" +
            "\n" +
            "  \n" +
            "- Are they out celebrating?\n" +
            "- They're home.\n" +
            "\n" +
            "  \n" +
            "They don't know what to do.\n" +
            "Laying out, sleeping in.\n" +
            "\n" +
            "  \n" +
            "I heard your Uncle Oarl was on his way\n" +
            "to San Antonio with a cricket.\n" +
            "\n" +
            "  \n" +
            "At least we got our honey back.\n" +
            "\n" +
            "  \n" +
            "Sometimes I think, so what if humans\n" +
            "liked our honey? Who wouldn't?\n" +
            "\n" +
            "  \n" +
            "It's the greatest thing in the world!\n" +
            "I was excited to be part of making it.\n" +
            "\n" +
            "  \n" +
            "This was my new desk. This was my\n" +
            "new job. I wanted to do it really well.\n" +
            "\n" +
            "  \n" +
            "And now...\n" +
            "\n" +
            "  \n" +
            "Now I can't.\n" +
            "\n" +
            "  \n" +
            "I don't understand\n" +
            "why they're not happy.\n" +
            "\n" +
            "  \n" +
            "I thought their lives would be better!\n" +
            "\n" +
            "  \n" +
            "They're doing nothing. It's amazing.\n" +
            "Honey really changes people.\n" +
            "\n" +
            "  \n" +
            "You don't have any idea\n" +
            "what's going on, do you?\n" +
            "\n" +
            "  \n" +
            "- What did you want to show me?\n" +
            "- This.\n" +
            "\n" +
            "  \n" +
            "What happened here?\n" +
            "\n" +
            "  \n" +
            "That is not the half of it.\n" +
            "\n" +
            "  \n" +
            "Oh, no. Oh, my.\n" +
            "\n" +
            "  \n" +
            "They're all wilting.\n" +
            "\n" +
            "  \n" +
            "Doesn't look very good, does it?\n" +
            "\n" +
            "  \n" +
            "No.\n" +
            "\n" +
            "  \n" +
            "And whose fault do you think that is?\n" +
            "\n" +
            "  \n" +
            "You know, I'm gonna guess bees.\n" +
            "\n" +
            "  \n" +
            "Bees?\n" +
            "\n" +
            "  \n" +
            "Specifically, me.\n" +
            "\n" +
            "  \n" +
            "I didn't think bees not needing to make\n" +
            "honey would affect all these things.\n" +
            "\n" +
            "  \n" +
            "It's notjust flowers.\n" +
            "Fruits, vegetables, they all need bees.\n" +
            "\n" +
            "  \n" +
            "That's our whole SAT test right there.\n" +
            "\n" +
            "  \n" +
            "Take away produce, that affects\n" +
            "the entire animal kingdom.\n" +
            "\n" +
            "  \n" +
            "And then, of course...\n" +
            "\n" +
            "  \n" +
            "The human species?\n" +
            "\n" +
            "  \n" +
            "So if there's no more pollination,\n" +
            "\n" +
            "  \n" +
            "it could all just go south here,\n" +
            "couldn't it?\n" +
            "\n" +
            "  \n" +
            "I know this is also partly my fault.\n" +
            "\n" +
            "  \n" +
            "How about a suicide pact?\n" +
            "\n" +
            "  \n" +
            "How do we do it?\n" +
            "\n" +
            "  \n" +
            "- I'll sting you, you step on me.\n" +
            "- Thatjust kills you twice.\n" +
            "\n" +
            "  \n" +
            "Right, right.\n" +
            "\n" +
            "  \n" +
            "Listen, Barry...\n" +
            "sorry, but I gotta get going.\n" +
            "\n" +
            "  \n" +
            "I had to open my mouth and talk.\n" +
            "\n" +
            "  \n" +
            "Vanessa?\n" +
            "\n" +
            "  \n" +
            "Vanessa? Why are you leaving?\n" +
            "Where are you going?\n" +
            "\n" +
            "  \n" +
            "To the final Tournament of Roses parade\n" +
            "in Pasadena.\n" +
            "\n" +
            "  \n" +
            "They've moved it to this weekend\n" +
            "because all the flowers are dying.\n" +
            "\n" +
            "  \n" +
            "It's the last chance\n" +
            "I'll ever have to see it.\n" +
            "\n" +
            "  \n" +
            "Vanessa, I just wanna say I'm sorry.\n" +
            "I never meant it to turn out like this.\n" +
            "\n" +
            "  \n" +
            "I know. Me neither.\n" +
            "\n" +
            "  \n" +
            "Tournament of Roses.\n" +
            "Roses can't do sports.\n" +
            "\n" +
            "  \n" +
            "Wait a minute. Roses. Roses?\n" +
            "\n" +
            "  \n" +
            "Roses!\n" +
            "\n" +
            "  \n" +
            "Vanessa!\n" +
            "\n" +
            "  \n" +
            "Roses?!\n" +
            "\n" +
            "  \n" +
            "Barry?\n" +
            "\n" +
            "  \n" +
            "- Roses are flowers!\n" +
            "- Yes, they are.\n" +
            "\n" +
            "  \n" +
            "Flowers, bees, pollen!\n" +
            "\n" +
            "  \n" +
            "I know.\n" +
            "That's why this is the last parade.\n" +
            "\n" +
            "  \n" +
            "Maybe not.\n" +
            "Oould you ask him to slow down?\n" +
            "\n" +
            "  \n" +
            "Oould you slow down?\n" +
            "\n" +
            "  \n" +
            "Barry!\n" +
            "\n" +
            "  \n" +
            "OK, I made a huge mistake.\n" +
            "This is a total disaster, all my fault.\n" +
            "\n" +
            "  \n" +
            "Yes, it kind of is.\n" +
            "\n" +
            "  \n" +
            "I've ruined the planet.\n" +
            "I wanted to help you\n" +
            "\n" +
            "  \n" +
            "with the flower shop.\n" +
            "I've made it worse.\n" +
            "\n" +
            "  \n" +
            "Actually, it's completely closed down.\n" +
            "\n" +
            "  \n" +
            "I thought maybe you were remodeling.\n" +
            "\n" +
            "  \n" +
            "But I have another idea, and it's\n" +
            "greater than my previous ideas combined.\n" +
            "\n" +
            "  \n" +
            "I don't want to hear it!\n" +
            "\n" +
            "  \n" +
            "All right, they have the roses,\n" +
            "the roses have the pollen.\n" +
            "\n" +
            "  \n" +
            "I know every bee, plant\n" +
            "and flower bud in this park.\n" +
            "\n" +
            "  \n" +
            "All we gotta do is get what they've got\n" +
            "back here with what we've got.\n" +
            "\n" +
            "  \n" +
            "- Bees.\n" +
            "- Park.\n" +
            "\n" +
            "  \n" +
            "- Pollen!\n" +
            "- Flowers.\n" +
            "\n" +
            "  \n" +
            "- Repollination!\n" +
            "- Across the nation!\n" +
            "\n" +
            "  \n" +
            "Tournament of Roses,\n" +
            "Pasadena, Oalifornia.\n" +
            "\n" +
            "  \n" +
            "They've got nothing\n" +
            "but flowers, floats and cotton candy.\n" +
            "\n" +
            "  \n" +
            "Security will be tight.\n" +
            "\n" +
            "  \n" +
            "I have an idea.\n" +
            "\n" +
            "  \n" +
            "Vanessa Bloome, FTD.\n" +
            "\n" +
            "  \n" +
            "Official floral business. It's real.\n" +
            "\n" +
            "  \n" +
            "Sorry, ma'am. Nice brooch.\n" +
            "\n" +
            "  \n" +
            "Thank you. It was a gift.\n" +
            "\n" +
            "  \n" +
            "Once inside,\n" +
            "we just pick the right float.\n" +
            "\n" +
            "  \n" +
            "How about The Princess and the Pea?\n" +
            "\n" +
            "  \n" +
            "I could be the princess,\n" +
            "and you could be the pea!\n" +
            "\n" +
            "  \n" +
            "Yes, I got it.\n" +
            "\n" +
            "  \n" +
            "- Where should I sit?\n" +
            "- What are you?\n" +
            "\n" +
            "  \n" +
            "- I believe I'm the pea.\n" +
            "- The pea?\n" +
            "\n" +
            "  \n" +
            "It goes under the mattresses.\n" +
            "\n" +
            "  \n" +
            "- Not in this fairy tale, sweetheart.\n" +
            "- I'm getting the marshal.\n" +
            "\n" +
            "  \n" +
            "You do that!\n" +
            "This whole parade is a fiasco!\n" +
            "\n" +
            "  \n" +
            "Let's see what this baby'll do.\n" +
            "\n" +
            "  \n" +
            "Hey, what are you doing?!\n" +
            "\n" +
            "  \n" +
            "Then all we do\n" +
            "is blend in with traffic...\n" +
            "\n" +
            "  \n" +
            "...without arousing suspicion.\n" +
            "\n" +
            "  \n" +
            "Once at the airport,\n" +
            "there's no stopping us.\n" +
            "\n" +
            "  \n" +
            "Stop! Security.\n" +
            "\n" +
            "  \n" +
            "- You and your insect pack your float?\n" +
            "- Yes.\n" +
            "\n" +
            "  \n" +
            "Has it been\n" +
            "in your possession the entire time?\n" +
            "\n" +
            "  \n" +
            "Would you remove your shoes?\n" +
            "\n" +
            "  \n" +
            "- Remove your stinger.\n" +
            "- It's part of me.\n" +
            "\n" +
            "  \n" +
            "I know. Just having some fun.\n" +
            "Enjoy your flight.\n" +
            "\n" +
            "  \n" +
            "Then if we're lucky, we'll have\n" +
            "just enough pollen to do the job.\n" +
            "\n" +
            "  \n" +
            "Oan you believe how lucky we are? We\n" +
            "have just enough pollen to do the job!\n" +
            "\n" +
            "  \n" +
            "I think this is gonna work.\n" +
            "\n" +
            "  \n" +
            "It's got to work.\n" +
            "\n" +
            "  \n" +
            "Attention, passengers,\n" +
            "this is Oaptain Scott.\n" +
            "\n" +
            "  \n" +
            "We have a bit of bad weather\n" +
            "in New York.\n" +
            "\n" +
            "  \n" +
            "It looks like we'll experience\n" +
            "a couple hours delay.\n" +
            "\n" +
            "  \n" +
            "Barry, these are cut flowers\n" +
            "with no water. They'll never make it.\n" +
            "\n" +
            "  \n" +
            "I gotta get up there\n" +
            "and talk to them.\n" +
            "\n" +
            "  \n" +
            "Be careful.\n" +
            "\n" +
            "  \n" +
            "Oan I get help\n" +
            "with the Sky Mall magazine?\n" +
            "\n" +
            "  \n" +
            "I'd like to order the talking\n" +
            "inflatable nose and ear hair trimmer.\n" +
            "\n" +
            "  \n" +
            "Oaptain, I'm in a real situation.\n" +
            "\n" +
            "  \n" +
            "- What'd you say, Hal?\n" +
            "- Nothing.\n" +
            "\n" +
            "  \n" +
            "Bee!\n" +
            "\n" +
            "  \n" +
            "Don't freak out! My entire species...\n" +
            "\n" +
            "  \n" +
            "What are you doing?\n" +
            "\n" +
            "  \n" +
            "- Wait a minute! I'm an attorney!\n" +
            "- Who's an attorney?\n" +
            "\n" +
            "  \n" +
            "Don't move.\n" +
            "\n" +
            "  \n" +
            "Oh, Barry.\n" +
            "\n" +
            "  \n" +
            "Good afternoon, passengers.\n" +
            "This is your captain.\n" +
            "\n" +
            "  \n" +
            "Would a Miss Vanessa Bloome in 24B\n" +
            "please report to the cockpit?\n" +
            "\n" +
            "  \n" +
            "And please hurry!\n" +
            "\n" +
            "  \n" +
            "What happened here?\n" +
            "\n" +
            "  \n" +
            "There was a DustBuster,\n" +
            "a toupee, a life raft exploded.\n" +
            "\n" +
            "  \n" +
            "One's bald, one's in a boat,\n" +
            "they're both unconscious!\n" +
            "\n" +
            "  \n" +
            "- Is that another bee joke?\n" +
            "- No!\n" +
            "\n" +
            "  \n" +
            "No one's flying the plane!\n" +
            "\n" +
            "  \n" +
            "This is JFK control tower, Flight 356.\n" +
            "What's your status?\n" +
            "\n" +
            "  \n" +
            "This is Vanessa Bloome.\n" +
            "I'm a florist from New York.\n" +
            "\n" +
            "  \n" +
            "Where's the pilot?\n" +
            "\n" +
            "  \n" +
            "He's unconscious,\n" +
            "and so is the copilot.\n" +
            "\n" +
            "  \n" +
            "Not good. Does anyone onboard\n" +
            "have flight experience?\n" +
            "\n" +
            "  \n" +
            "As a matter of fact, there is.\n" +
            "\n" +
            "  \n" +
            "- Who's that?\n" +
            "- Barry Benson.\n" +
            "\n" +
            "  \n" +
            "From the honey trial?! Oh, great.\n" +
            "\n" +
            "  \n" +
            "Vanessa, this is nothing more\n" +
            "than a big metal bee.\n" +
            "\n" +
            "  \n" +
            "It's got giant wings, huge engines.\n" +
            "\n" +
            "  \n" +
            "I can't fly a plane.\n" +
            "\n" +
            "  \n" +
            "- Why not? Isn't John Travolta a pilot?\n" +
            "- Yes.\n" +
            "\n" +
            "  \n" +
            "How hard could it be?\n" +
            "\n" +
            "  \n" +
            "Wait, Barry!\n" +
            "We're headed into some lightning.\n" +
            "\n" +
            "  \n" +
            "This is Bob Bumble. We have some\n" +
            "late-breaking news from JFK Airport,\n" +
            "\n" +
            "  \n" +
            "where a suspenseful scene\n" +
            "is developing.\n" +
            "\n" +
            "  \n" +
            "Barry Benson,\n" +
            "fresh from his legal victory...\n" +
            "\n" +
            "  \n" +
            "That's Barry!\n" +
            "\n" +
            "  \n" +
            "...is attempting to land a plane,\n" +
            "loaded with people, flowers\n" +
            "\n" +
            "  \n" +
            "and an incapacitated flight crew.\n" +
            "\n" +
            "  \n" +
            "Flowers?!\n" +
            "\n" +
            "  \n" +
            "We have a storm in the area\n" +
            "and two individuals at the controls\n" +
            "\n" +
            "  \n" +
            "with absolutely no flight experience.\n" +
            "\n" +
            "  \n" +
            "Just a minute.\n" +
            "There's a bee on that plane.\n" +
            "\n" +
            "  \n" +
            "I'm quite familiar with Mr. Benson\n" +
            "and his no-account compadres.\n" +
            "\n" +
            "  \n" +
            "They've done enough damage.\n" +
            "\n" +
            "  \n" +
            "But isn't he your only hope?\n" +
            "\n" +
            "  \n" +
            "Technically, a bee\n" +
            "shouldn't be able to fly at all.\n" +
            "\n" +
            "  \n" +
            "Their wings are too small...\n" +
            "\n" +
            "  \n" +
            "Haven't we heard this a million times?\n" +
            "\n" +
            "  \n" +
            "\"The surface area of the wings\n" +
            "and body mass make no sense.\"\n" +
            "\n" +
            "  \n" +
            "- Get this on the air!\n" +
            "- Got it.\n" +
            "\n" +
            "  \n" +
            "- Stand by.\n" +
            "- We're going live.\n" +
            "\n" +
            "  \n" +
            "The way we work may be a mystery to you.\n" +
            "\n" +
            "  \n" +
            "Making honey takes a lot of bees\n" +
            "doing a lot of small jobs.\n" +
            "\n" +
            "  \n" +
            "But let me tell you about a small job.\n" +
            "\n" +
            "  \n" +
            "If you do it well,\n" +
            "it makes a big difference.\n" +
            "\n" +
            "  \n" +
            "More than we realized.\n" +
            "To us, to everyone.\n" +
            "\n" +
            "  \n" +
            "That's why I want to get bees\n" +
            "back to working together.\n" +
            "\n" +
            "  \n" +
            "That's the bee way!\n" +
            "We're not made of Jell-O.\n" +
            "\n" +
            "  \n" +
            "We get behind a fellow.\n" +
            "\n" +
            "  \n" +
            "- Black and yellow!\n" +
            "- Hello!\n" +
            "\n" +
            "  \n" +
            "Left, right, down, hover.\n" +
            "\n" +
            "  \n" +
            "- Hover?\n" +
            "- Forget hover.\n" +
            "\n" +
            "  \n" +
            "This isn't so hard.\n" +
            "Beep-beep! Beep-beep!\n" +
            "\n" +
            "  \n" +
            "Barry, what happened?!\n" +
            "\n" +
            "  \n" +
            "Wait, I think we were\n" +
            "on autopilot the whole time.\n" +
            "\n" +
            "  \n" +
            "- That may have been helping me.\n" +
            "- And now we're not!\n" +
            "\n" +
            "  \n" +
            "So it turns out I cannot fly a plane.\n" +
            "\n" +
            "  \n" +
            "All of you, let's get\n" +
            "behind this fellow! Move it out!\n" +
            "\n" +
            "  \n" +
            "Move out!\n" +
            "\n" +
            "  \n" +
            "Our only chance is if I do what I'd do,\n" +
            "you copy me with the wings of the plane!\n" +
            "\n" +
            "  \n" +
            "Don't have to yell.\n" +
            "\n" +
            "  \n" +
            "I'm not yelling!\n" +
            "We're in a lot of trouble.\n" +
            "\n" +
            "  \n" +
            "It's very hard to concentrate\n" +
            "with that panicky tone in your voice!\n" +
            "\n" +
            "  \n" +
            "It's not a tone. I'm panicking!\n" +
            "\n" +
            "  \n" +
            "I can't do this!\n" +
            "\n" +
            "  \n" +
            "Vanessa, pull yourself together.\n" +
            "You have to snap out of it!\n" +
            "\n" +
            "  \n" +
            "You snap out of it.\n" +
            "\n" +
            "  \n" +
            "You snap out of it.\n" +
            "\n" +
            "  \n" +
            "- You snap out of it!\n" +
            "- You snap out of it!\n" +
            "\n" +
            "  \n" +
            "- You snap out of it!\n" +
            "- You snap out of it!\n" +
            "\n" +
            "  \n" +
            "- You snap out of it!\n" +
            "- You snap out of it!\n" +
            "\n" +
            "  \n" +
            "- Hold it!\n" +
            "- Why? Oome on, it's my turn.\n" +
            "\n" +
            "  \n" +
            "How is the plane flying?\n" +
            "\n" +
            "  \n" +
            "I don't know.\n" +
            "\n" +
            "  \n" +
            "Hello?\n" +
            "\n" +
            "  \n" +
            "Benson, got any flowers\n" +
            "for a happy occasion in there?\n" +
            "\n" +
            "  \n" +
            "The Pollen Jocks!\n" +
            "\n" +
            "  \n" +
            "They do get behind a fellow.\n" +
            "\n" +
            "  \n" +
            "- Black and yellow.\n" +
            "- Hello.\n" +
            "\n" +
            "  \n" +
            "All right, let's drop this tin can\n" +
            "on the blacktop.\n" +
            "\n" +
            "  \n" +
            "Where? I can't see anything. Oan you?\n" +
            "\n" +
            "  \n" +
            "No, nothing. It's all cloudy.\n" +
            "\n" +
            "  \n" +
            "Oome on. You got to think bee, Barry.\n" +
            "\n" +
            "  \n" +
            "- Thinking bee.\n" +
            "- Thinking bee.\n" +
            "\n" +
            "  \n" +
            "Thinking bee!\n" +
            "Thinking bee! Thinking bee!\n" +
            "\n" +
            "  \n" +
            "Wait a minute.\n" +
            "I think I'm feeling something.\n" +
            "\n" +
            "  \n" +
            "- What?\n" +
            "- I don't know. It's strong, pulling me.\n" +
            "\n" +
            "  \n" +
            "Like a 27-million-year-old instinct.\n" +
            "\n" +
            "  \n" +
            "Bring the nose down.\n" +
            "\n" +
            "  \n" +
            "Thinking bee!\n" +
            "Thinking bee! Thinking bee!\n" +
            "\n" +
            "  \n" +
            "- What in the world is on the tarmac?\n" +
            "- Get some lights on that!\n" +
            "\n" +
            "  \n" +
            "Thinking bee!\n" +
            "Thinking bee! Thinking bee!\n" +
            "\n" +
            "  \n" +
            "- Vanessa, aim for the flower.\n" +
            "- OK.\n" +
            "\n" +
            "  \n" +
            "Out the engines. We're going in\n" +
            "on bee power. Ready, boys?\n" +
            "\n" +
            "  \n" +
            "Affirmative!\n" +
            "\n" +
            "  \n" +
            "Good. Good. Easy, now. That's it.\n" +
            "\n" +
            "  \n" +
            "Land on that flower!\n" +
            "\n" +
            "  \n" +
            "Ready? Full reverse!\n" +
            "\n" +
            "  \n" +
            "Spin it around!\n" +
            "\n" +
            "  \n" +
            "- Not that flower! The other one!\n" +
            "- Which one?\n" +
            "\n" +
            "  \n" +
            "- That flower.\n" +
            "- I'm aiming at the flower!\n" +
            "\n" +
            "  \n" +
            "That's a fat guy in a flowered shirt.\n" +
            "I mean the giant pulsating flower\n" +
            "\n" +
            "  \n" +
            "made of millions of bees!\n" +
            "\n" +
            "  \n" +
            "Pull forward. Nose down. Tail up.\n" +
            "\n" +
            "  \n" +
            "Rotate around it.\n" +
            "\n" +
            "  \n" +
            "- This is insane, Barry!\n" +
            "- This's the only way I know how to fly.\n" +
            "\n" +
            "  \n" +
            "Am I koo-koo-kachoo, or is this plane\n" +
            "flying in an insect-like pattern?\n" +
            "\n" +
            "  \n" +
            "Get your nose in there. Don't be afraid.\n" +
            "Smell it. Full reverse!\n" +
            "\n" +
            "  \n" +
            "Just drop it. Be a part of it.\n" +
            "\n" +
            "  \n" +
            "Aim for the center!\n" +
            "\n" +
            "  \n" +
            "Now drop it in! Drop it in, woman!\n" +
            "\n" +
            "  \n" +
            "Oome on, already.\n" +
            "\n" +
            "  \n" +
            "Barry, we did it!\n" +
            "You taught me how to fly!\n" +
            "\n" +
            "  \n" +
            "- Yes. No high-five!\n" +
            "- Right.\n" +
            "\n" +
            "  \n" +
            "Barry, it worked!\n" +
            "Did you see the giant flower?\n" +
            "\n" +
            "  \n" +
            "What giant flower? Where? Of course\n" +
            "I saw the flower! That was genius!\n" +
            "\n" +
            "  \n" +
            "- Thank you.\n" +
            "- But we're not done yet.\n" +
            "\n" +
            "  \n" +
            "Listen, everyone!\n" +
            "\n" +
            "  \n" +
            "This runway is covered\n" +
            "with the last pollen\n" +
            "\n" +
            "  \n" +
            "from the last flowers\n" +
            "available anywhere on Earth.\n" +
            "\n" +
            "  \n" +
            "That means this is our last chance.\n" +
            "\n" +
            "  \n" +
            "We're the only ones who make honey,\n" +
            "pollinate flowers and dress like this.\n" +
            "\n" +
            "  \n" +
            "If we're gonna survive as a species,\n" +
            "this is our moment! What do you say?\n" +
            "\n" +
            "  \n" +
            "Are we going to be bees, orjust\n" +
            "Museum of Natural History keychains?\n" +
            "\n" +
            "  \n" +
            "We're bees!\n" +
            "\n" +
            "  \n" +
            "Keychain!\n" +
            "\n" +
            "  \n" +
            "Then follow me! Except Keychain.\n" +
            "\n" +
            "  \n" +
            "Hold on, Barry. Here.\n" +
            "\n" +
            "  \n" +
            "You've earned this.\n" +
            "\n" +
            "  \n" +
            "Yeah!\n" +
            "\n" +
            "  \n" +
            "I'm a Pollen Jock! And it's a perfect\n" +
            "fit. All I gotta do are the sleeves.\n" +
            "\n" +
            "  \n" +
            "Oh, yeah.\n" +
            "\n" +
            "  \n" +
            "That's our Barry.\n" +
            "\n" +
            "  \n" +
            "Mom! The bees are back!\n" +
            "\n" +
            "  \n" +
            "If anybody needs\n" +
            "to make a call, now's the time.\n" +
            "\n" +
            "  \n" +
            "I got a feeling we'll be\n" +
            "working late tonight!\n" +
            "\n" +
            "  \n" +
            "Here's your change. Have a great\n" +
            "afternoon! Oan I help who's next?\n" +
            "\n" +
            "  \n" +
            "Would you like some honey with that?\n" +
            "It is bee-approved. Don't forget these.\n" +
            "\n" +
            "  \n" +
            "Milk, cream, cheese, it's all me.\n" +
            "And I don't see a nickel!\n" +
            "\n" +
            "  \n" +
            "Sometimes I just feel\n" +
            "like a piece of meat!\n" +
            "\n" +
            "  \n" +
            "I had no idea.\n" +
            "\n" +
            "  \n" +
            "Barry, I'm sorry.\n" +
            "Have you got a moment?\n" +
            "\n" +
            "  \n" +
            "Would you excuse me?\n" +
            "My mosquito associate will help you.\n" +
            "\n" +
            "  \n" +
            "Sorry I'm late.\n" +
            "\n" +
            "  \n" +
            "He's a lawyer too?\n" +
            "\n" +
            "  \n" +
            "I was already a blood-sucking parasite.\n" +
            "All I needed was a briefcase.\n" +
            "\n" +
            "  \n" +
            "Have a great afternoon!\n" +
            "\n" +
            "  \n" +
            "Barry, I just got this huge tulip order,\n" +
            "and I can't get them anywhere.\n" +
            "\n" +
            "  \n" +
            "No problem, Vannie.\n" +
            "Just leave it to me.\n" +
            "\n" +
            "  \n" +
            "You're a lifesaver, Barry.\n" +
            "Oan I help who's next?\n" +
            "\n" +
            "  \n" +
            "All right, scramble, jocks!\n" +
            "It's time to fly.\n" +
            "\n" +
            "  \n" +
            "Thank you, Barry!\n" +
            "\n" +
            "  \n" +
            "That bee is living my life!\n" +
            "\n" +
            "  \n" +
            "Let it go, Kenny.\n" +
            "\n" +
            "  \n" +
            "- When will this nightmare end?!\n" +
            "- Let it all go.\n" +
            "\n" +
            "  \n" +
            "- Beautiful day to fly.\n" +
            "- Sure is.\n" +
            "\n" +
            "  \n" +
            "Between you and me,\n" +
            "I was dying to get out of that office.\n" +
            "\n" +
            "  \n" +
            "You have got\n" +
            "to start thinking bee, my friend.\n" +
            "\n" +
            "  \n" +
            "- Thinking bee!\n" +
            "- Me?\n" +
            "\n" +
            "  \n" +
            "Hold it. Let's just stop\n" +
            "for a second. Hold it.\n" +
            "\n" +
            "  \n" +
            "I'm sorry. I'm sorry, everyone.\n" +
            "Oan we stop here?\n" +
            "\n" +
            "  \n" +
            "I'm not making a major life decision\n" +
            "during a production number!\n" +
            "\n" +
            "  \n" +
            "All right. Take ten, everybody.\n" +
            "Wrap it up, guys.\n" +
            "\n" +
            "  \n" +
            "I had virtually no rehearsal for that.\n" +
            "\n" +
            "Special thanks to SergeiK.";

    private static final String MALL_COP_SCRIPT = " \n" +
            "Let's go!\n" +
            "Move it!\n" +
            "\n" +
            "  \n" +
            "50 more yards!\n" +
            "\n" +
            "  \n" +
            "All right, let's go! Pick it up!\n" +
            "\n" +
            "  \n" +
            "- Let's go!\n" +
            "- Yes, sir!\n" +
            "\n" +
            "  \n" +
            "You're running out of time, Bryant!\n" +
            "\n" +
            "  \n" +
            "Make it all the way around the track!\n" +
            "Come on!\n" +
            "\n" +
            "  \n" +
            "You want to be troopers?\n" +
            "You better move it!\n" +
            "\n" +
            "  \n" +
            "All right, next, get up here!\n" +
            "\n" +
            "  \n" +
            "Let's hit it now.\n" +
            "\n" +
            "  \n" +
            "Dean, come on!\n" +
            "\n" +
            "  \n" +
            "All right.\n" +
            "You've all completed the written exam.\n" +
            "\n" +
            "  \n" +
            "However, you must now pass\n" +
            "the obstacle course\n" +
            "\n" +
            "  \n" +
            "to be admitted into the training program.\n" +
            "\n" +
            "  \n" +
            "And remember, survive this,\n" +
            "\n" +
            "  \n" +
            "and you're on the front lines\n" +
            "of keeping New Jersey safe.\n" +
            "\n" +
            "  \n" +
            "Yeah.\n" +
            "\n" +
            "  \n" +
            "Sorry about the test, Dad.\n" +
            "\n" +
            "  \n" +
            "We all have our crosses to bear, sweetheart.\n" +
            "\n" +
            "  \n" +
            "Mine is named hypoglycemia.\n" +
            "\n" +
            "  \n" +
            "Well, that's why you always have to have\n" +
            "sugar nearby.\n" +
            "\n" +
            "  \n" +
            "Are you gonna have pie?\n" +
            "\n" +
            "  \n" +
            "Not tonight, Ma.\n" +
            "\n" +
            "  \n" +
            "I'm just kidding.\n" +
            "Yeah, I'm gonna want some pie.\n" +
            "\n" +
            "  \n" +
            "You...\n" +
            "\n" +
            "  \n" +
            "No, I meant now, Ma. Get the pie now.\n" +
            "\n" +
            "  \n" +
            "- Okay.\n" +
            "- You said it,\n" +
            "\n" +
            "  \n" +
            "and I just kind of got that\n" +
            "stuck in my head now,\n" +
            "\n" +
            "  \n" +
            "and can't really get it out. Pie. Here we go.\n" +
            "\n" +
            "  \n" +
            "It really helps heal.\n" +
            "\n" +
            "  \n" +
            "And, you know, not always, but sometimes,\n" +
            "\n" +
            "  \n" +
            "you gotta do like the kids say,\n" +
            "and just say, \"Whatever.\"\n" +
            "\n" +
            "  \n" +
            "Kids don't talk like that.\n" +
            "\n" +
            "  \n" +
            "Some do, sweetheart. The older ones, okay?\n" +
            "\n" +
            "  \n" +
            "I hear them in the mall. You know?\n" +
            "\n" +
            "  \n" +
            "Peanut butter.\n" +
            "\n" +
            "  \n" +
            "It just fills the cracks of the heart.\n" +
            "\n" +
            "  \n" +
            "Go away, pain.\n" +
            "\n" +
            "  \n" +
            "- What?\n" +
            "- Paulie.\n" +
            "\n" +
            "  \n" +
            "Oh, no. Come on, Ma.\n" +
            "\n" +
            "  \n" +
            "I'm not ready for this right now.\n" +
            "\n" +
            "  \n" +
            "- Dad.\n" +
            "- Please.\n" +
            "\n" +
            "  \n" +
            "We just don't want to see you go through\n" +
            "another holiday alone.\n" +
            "\n" +
            "  \n" +
            "But I'm not alone.\n" +
            "\n" +
            "  \n" +
            "I've got you two. You know?\n" +
            "\n" +
            "  \n" +
            "And besides, Black Friday's coming,\n" +
            "\n" +
            "  \n" +
            "so my dance card's gonna be pretty full.\n" +
            "\n" +
            "  \n" +
            "What?\n" +
            "It's the busiest shopping day of the year.\n" +
            "\n" +
            "  \n" +
            "Yeah, I should have known better\n" +
            "than to try to explain it to civilians.\n" +
            "\n" +
            "  \n" +
            "I wish I had a coworker here, like, \"Tyler,\n" +
            "hey. You know, Black Friday's coming.\"\n" +
            "\n" +
            "  \n" +
            "\"Gee, Paul, you don't have to tell me\n" +
            "Black Friday's coming.\n" +
            "\n" +
            "  \n" +
            "\"Why do you think\n" +
            "I've been walking around here\n" +
            "\n" +
            "  \n" +
            "\"with the eyes of an eagle?\"\n" +
            "\n" +
            "  \n" +
            "- We prepare.\n" +
            "- Dad, what does all that have to do\n" +
            "\n" +
            "  \n" +
            "with being happy for the rest of your life?\n" +
            "\n" +
            "  \n" +
            "You said, and I quote,\n" +
            "\"If I don't have a girlfriend by November,\n" +
            "\n" +
            "  \n" +
            "\"I'll let you sign me up\n" +
            "for perfectmatch.com.\"\n" +
            "\n" +
            "  \n" +
            "That was last year.\n" +
            "\n" +
            "  \n" +
            "Okay.\n" +
            "\n" +
            "  \n" +
            "- Here we are.\n" +
            "- Okay.\n" +
            "\n" +
            "  \n" +
            "\"What are you looking for in a woman?\"\n" +
            "\n" +
            "  \n" +
            "Well, your mother certainly\n" +
            "had something special.\n" +
            "\n" +
            "  \n" +
            "Yeah, illegal immigrant status.\n" +
            "\n" +
            "  \n" +
            "She married you, got citizenship,\n" +
            "and then she left us.\n" +
            "\n" +
            "  \n" +
            "That's not entirely true.\n" +
            "\n" +
            "  \n" +
            "We did have some good times\n" +
            "back when she was still trying to trick me.\n" +
            "\n" +
            "  \n" +
            "- Well, I hate her.\n" +
            "- Well, you shouldn't.\n" +
            "\n" +
            "  \n" +
            "She gave me you.\n" +
            "\n" +
            "  \n" +
            "- I am pretty great.\n" +
            "- You are. You are.\n" +
            "\n" +
            "  \n" +
            "Okay, next question.\n" +
            "\"Tell us about yourself.\"\n" +
            "\n" +
            "  \n" +
            "Let's see.\n" +
            "\n" +
            "  \n" +
            "I know a lot about sharks.\n" +
            "\n" +
            "  \n" +
            "Let me stop you right there.\n" +
            "\n" +
            "  \n" +
            "Well-built and a great hugger.\n" +
            "\n" +
            "  \n" +
            "Awesome, Grandma.\n" +
            "\n" +
            "  \n" +
            "Not as awesome as this.\n" +
            "\n" +
            "  \n" +
            "What are you doing?\n" +
            "\n" +
            "  \n" +
            "Beefing up your profile with that\n" +
            "nifty video that you made a few years back.\n" +
            "\n" +
            "  \n" +
            "Ma, no.\n" +
            "\n" +
            "  \n" +
            "I don't know. Don't you think\n" +
            "it's a little too, \"Hey, look at me\"?\n" +
            "\n" +
            "  \n" +
            "Well, that is exactly what we want.\n" +
            "\n" +
            "  \n" +
            "Eyes on the prize.\n" +
            "\n" +
            "  \n" +
            "And don't worry,\n" +
            "I will edit out the sweaty parts.\n" +
            "\n" +
            "  \n" +
            "Dear God!\n" +
            "\n" +
            "  \n" +
            "Hey! Back away from the vehicle.\n" +
            "\n" +
            "  \n" +
            "Oh, dear God. Please.\n" +
            "\n" +
            "  \n" +
            "Chompers, get down!\n" +
            "\n" +
            "  \n" +
            "Hey, you know where a men's room is?\n" +
            "\n" +
            "  \n" +
            "I do.\n" +
            "You're gonna want to go to Lord and Taylor.\n" +
            "\n" +
            "  \n" +
            "They got 12 stalls and heated seats.\n" +
            "\n" +
            "  \n" +
            "Okay, keep the balls in the pit, kids. Kids!\n" +
            "\n" +
            "  \n" +
            "Okay, my lip is numb.\n" +
            "\n" +
            "  \n" +
            "All righty.\n" +
            "\n" +
            "  \n" +
            "- There you go.\n" +
            "- Thank you.\n" +
            "\n" +
            "  \n" +
            "Hey.\n" +
            "\n" +
            "  \n" +
            "Yeah, I know.\n" +
            "\n" +
            "  \n" +
            "That's not supposed to be here.\n" +
            "It's a minivan.\n" +
            "\n" +
            "  \n" +
            "... he can't handle it.\n" +
            "The puck travels to the far board...\n" +
            "\n" +
            "  \n" +
            "He keeps the play alive.\n" +
            "\n" +
            "  \n" +
            "- Paul!\n" +
            "- Hey.\n" +
            "\n" +
            "  \n" +
            "What is this?\n" +
            "\n" +
            "  \n" +
            "That's my report on how to ease\n" +
            "traffic flow from Macy's\n" +
            "\n" +
            "  \n" +
            "down through the specialty shops.\n" +
            "\n" +
            "  \n" +
            "- How's that working out for you?\n" +
            "- Actually, it's for all of us.\n" +
            "\n" +
            "  \n" +
            "You see, if we could reroute the customers\n" +
            "away from the food court,\n" +
            "\n" +
            "  \n" +
            "it's gonna help the kiosks\n" +
            "and cut down on shopper frustration.\n" +
            "\n" +
            "  \n" +
            "It's your classic two-bird,\n" +
            "one-stone scenario.\n" +
            "\n" +
            "  \n" +
            "- Can I ask you something?\n" +
            "- Anything.\n" +
            "\n" +
            "  \n" +
            "Why can't you just punch in, shut up\n" +
            "and punch out like the rest of us?\n" +
            "\n" +
            "  \n" +
            "Safety never takes a holiday.\n" +
            "\n" +
            "  \n" +
            "Did your mom crochet that on a pillow?\n" +
            "\n" +
            "  \n" +
            "Blart.\n" +
            "\n" +
            "  \n" +
            "This is Sims. He's a new trainee.\n" +
            "Let him trail you today.\n" +
            "\n" +
            "  \n" +
            "Hey. Paul Blart. Ten-year veteran.\n" +
            "\n" +
            "  \n" +
            "Wow. Veck Sims.\n" +
            "\n" +
            "  \n" +
            "Well, Veck Sims, welcome to the show.\n" +
            "Let's mount up.\n" +
            "\n" +
            "  \n" +
            "Oh, yeah. That's the good stuff.\n" +
            "\n" +
            "  \n" +
            "That's it. Treat her gentle, son.\n" +
            "\n" +
            "  \n" +
            "Slap it, honor it.\n" +
            "\n" +
            "  \n" +
            "So what made you want to pursue security?\n" +
            "\n" +
            "  \n" +
            "I never finished high school.\n" +
            "This is all I could get.\n" +
            "\n" +
            "  \n" +
            "Yeah, I'm currently working on becoming\n" +
            "a state trooper, myself.\n" +
            "\n" +
            "  \n" +
            "Right now, I'm goose egg for eight.\n" +
            "Hypoglycemia.\n" +
            "\n" +
            "  \n" +
            "Confusing, right? Cut yourself some slack.\n" +
            "\n" +
            "  \n" +
            "My first week riding on the job,\n" +
            "I got lost behind the Sears.\n" +
            "\n" +
            "  \n" +
            "They found me later in the fetal position,\n" +
            "sporting a full beard.\n" +
            "\n" +
            "  \n" +
            "I'm kidding. I can't grow a beard.\n" +
            "\n" +
            "  \n" +
            "My uncle can. Stay snug.\n" +
            "\n" +
            "  \n" +
            "Now, in the event\n" +
            "that you approach an assailant,\n" +
            "\n" +
            "  \n" +
            "here's what I want you to do.\n" +
            "You're gonna pull up,\n" +
            "\n" +
            "  \n" +
            "left hip forward, placing your right hand\n" +
            "on your away hip thusly,\n" +
            "\n" +
            "  \n" +
            "giving the illusion that you have a gun.\n" +
            "Which, of course, we both know\n" +
            "\n" +
            "  \n" +
            "you don't.\n" +
            "\n" +
            "  \n" +
            "Okay? But you know what we do have?\n" +
            "\n" +
            "  \n" +
            "Our voices! We have our voices.\n" +
            "\n" +
            "  \n" +
            "If you remember one thing\n" +
            "from today, it's this.\n" +
            "\n" +
            "  \n" +
            "The mind is the only weapon\n" +
            "that doesn't need a holster.\n" +
            "\n" +
            "  \n" +
            "Right. Awesome.\n" +
            "How long do we get for lunch?\n" +
            "\n" +
            "  \n" +
            "Half hour. But I eat in 20, which leaves me\n" +
            "five minutes for social time,\n" +
            "\n" +
            "  \n" +
            "five minutes to get refocused.\n" +
            "\n" +
            "  \n" +
            "We got a high roller.\n" +
            "\n" +
            "  \n" +
            "Sir, I'm gonna need you to pull to the right.\n" +
            "\n" +
            "  \n" +
            "Please pull to the side, sir. Out of traffic.\n" +
            "\n" +
            "  \n" +
            "Tan jacket, red scooter,\n" +
            "please pull to the right, out of traffic.\n" +
            "\n" +
            "  \n" +
            "Sir.\n" +
            "\n" +
            "  \n" +
            "Thank you.\n" +
            "\n" +
            "  \n" +
            "Driving kind of recklessly back there, sir.\n" +
            "\n" +
            "  \n" +
            "You're kidding.\n" +
            "\n" +
            "  \n" +
            "I don't joke about shopper safety.\n" +
            "\n" +
            "  \n" +
            "I'm afraid I'm gonna have to\n" +
            "issue you a citation.\n" +
            "\n" +
            "  \n" +
            "Gonna need your first and last. Last first.\n" +
            "\n" +
            "  \n" +
            "Sir. Sir. Sir, sir, sir.\n" +
            "\n" +
            "  \n" +
            "Please don't make this more difficult\n" +
            "than it needs to be, okay?\n" +
            "\n" +
            "  \n" +
            "Are you able to...\n" +
            "Sir. Sir! Sir. I am warning you, sir.\n" +
            "\n" +
            "  \n" +
            "You're pushing it.\n" +
            "\n" +
            "  \n" +
            "Sir. Sir. I am warning... Sir.\n" +
            "\n" +
            "  \n" +
            "Sir. Sir. Sir.\n" +
            "\n" +
            "  \n" +
            "Okay.\n" +
            "\n" +
            "  \n" +
            "This is adding up, sir. He'll be back.\n" +
            "He'll be back. He'll be back.\n" +
            "\n" +
            "  \n" +
            "- Hey.\n" +
            "- Hi. Do you need something?\n" +
            "\n" +
            "  \n" +
            "Yes. I'd like to welcome you to our mall.\n" +
            "\n" +
            "  \n" +
            "Well, thank you.\n" +
            "\n" +
            "  \n" +
            "Is there something else?\n" +
            "\n" +
            "  \n" +
            "Yeah. Yeah, yeah.\n" +
            "\n" +
            "  \n" +
            "Just looking for some hair extensions.\n" +
            "\n" +
            "  \n" +
            "Need a little more volume up top.\n" +
            "Do you do men?\n" +
            "\n" +
            "  \n" +
            "Do you do men hair? Do you do men hair?\n" +
            "On the men?\n" +
            "\n" +
            "  \n" +
            "Are you the guy\n" +
            "that crashed into the minivan?\n" +
            "\n" +
            "  \n" +
            "I don't think so. Which one?\n" +
            "\n" +
            "  \n" +
            "Well, that one. That one right there.\n" +
            "\n" +
            "  \n" +
            "Yeah. That one, yes. That...\n" +
            "You know, that one was me.\n" +
            "\n" +
            "  \n" +
            "- Oh, wow. Are you okay?\n" +
            "- Oh, yeah. Never better.\n" +
            "\n" +
            "  \n" +
            "Although they're docking the paycheck\n" +
            "pretty good.\n" +
            "\n" +
            "  \n" +
            "Yeah.\n" +
            "\n" +
            "  \n" +
            "You know what you should do?\n" +
            "You should get the security tape,\n" +
            "\n" +
            "  \n" +
            "and then, like, sell it to one of those shows,\n" +
            "you know, where people crash into stuff.\n" +
            "\n" +
            "  \n" +
            "- Hello, early retirement.\n" +
            "- Yeah, right?\n" +
            "\n" +
            "  \n" +
            "Volume. Right, let me just see what I've got.\n" +
            "\n" +
            "  \n" +
            "Yeah, this is Blart.\n" +
            "If you need me, I'm over by the kiosks.\n" +
            "\n" +
            "  \n" +
            "Who is this?\n" +
            "\n" +
            "  \n" +
            "It's Officer Blart, reporting from Sector 5.\n" +
            "\n" +
            "  \n" +
            "What the hell are you bothering me for?\n" +
            "\n" +
            "  \n" +
            "- Just a Code B check.\n" +
            "- What a moron.\n" +
            "\n" +
            "  \n" +
            "You know, I'll check in with them later.\n" +
            "It's pretty intense.\n" +
            "\n" +
            "  \n" +
            "Oh, right, yeah. Life of a security guard.\n" +
            "\n" +
            "  \n" +
            "- What, what?\n" +
            "- No, it's just that you said security guard,\n" +
            "\n" +
            "  \n" +
            "and it's perfectly acceptable...\n" +
            "\n" +
            "  \n" +
            "I'm so sorry if I called you the wrong thing.\n" +
            "\n" +
            "  \n" +
            "No, no, no, no. You did fine, you know?\n" +
            "\n" +
            "  \n" +
            "It's just that there's a huge,\n" +
            "huge controversy\n" +
            "\n" +
            "  \n" +
            "brewing in the industry right now,\n" +
            "\n" +
            "  \n" +
            "whether the title should be\n" +
            "Security Guard or Officer.\n" +
            "\n" +
            "  \n" +
            "I'm sure you heard about it.\n" +
            "\n" +
            "  \n" +
            "- I didn't.\n" +
            "- You will. You're gonna.\n" +
            "\n" +
            "  \n" +
            "- But I'm sure I will.\n" +
            "- It's out there.\n" +
            "\n" +
            "  \n" +
            "So, you all set\n" +
            "for the busiest shopping day of the year?\n" +
            "\n" +
            "  \n" +
            "Yeah, right.\n" +
            "And the worst day for a birthday.\n" +
            "\n" +
            "  \n" +
            "This year, it falls on a Black Friday, which\n" +
            "means I probably won't even get a card.\n" +
            "\n" +
            "  \n" +
            "Everyone's too busy shopping.\n" +
            "\n" +
            "  \n" +
            "You know what? Yeah. Autumn Ash.\n" +
            "\n" +
            "  \n" +
            "- Yeah.\n" +
            "- I think that's your color.\n" +
            "\n" +
            "  \n" +
            "- I think this'll work.\n" +
            "- It's a winner.\n" +
            "\n" +
            "  \n" +
            "- So that's $9.95.\n" +
            "- $9.95?\n" +
            "\n" +
            "  \n" +
            "- Yeah.\n" +
            "- Wow.\n" +
            "\n" +
            "  \n" +
            "At those prices,\n" +
            "now you got me thinking ponytail.\n" +
            "\n" +
            "  \n" +
            "All right. Thank you.\n" +
            "\n" +
            "  \n" +
            "Thank you.\n" +
            "\n" +
            "  \n" +
            "- Right. So there you go.\n" +
            "- Okay.\n" +
            "\n" +
            "  \n" +
            "And, there you go.\n" +
            "\n" +
            "  \n" +
            "Thank you, Amy.\n" +
            "\n" +
            "  \n" +
            "Thank you, Officer Blart.\n" +
            "\n" +
            "  \n" +
            "Hey, Blart. Wow, nice shirt.\n" +
            "\n" +
            "  \n" +
            "You went with a medium?\n" +
            "\n" +
            "  \n" +
            "It's a bit formfitting,\n" +
            "\n" +
            "  \n" +
            "but that's 'cause we're required to wear\n" +
            "protective vests under our...\n" +
            "\n" +
            "  \n" +
            "No. Not buying it. No.\n" +
            "\n" +
            "  \n" +
            "'Cause I don't see any vest\n" +
            "underneath here, so...\n" +
            "\n" +
            "  \n" +
            "No, but it's a thick T-shirt.\n" +
            "Basically like a thermal they have you wear.\n" +
            "\n" +
            "  \n" +
            "Nope. Nope. No.\n" +
            "\n" +
            "  \n" +
            "I don't understand why you're laughing.\n" +
            "I just called you fat.\n" +
            "\n" +
            "  \n" +
            "I'm not laughing.\n" +
            "\n" +
            "  \n" +
            "Yeah, whatever. Amy.\n" +
            "\n" +
            "  \n" +
            "Hey, everyone's going to American Joe's\n" +
            "tonight, and I want to see you there.\n" +
            "\n" +
            "  \n" +
            "Okay?\n" +
            "We're gonna split some onion strings.\n" +
            "\n" +
            "  \n" +
            "Wow. Wow.\n" +
            "\n" +
            "  \n" +
            "Good.\n" +
            "\n" +
            "  \n" +
            "Good hang.\n" +
            "\n" +
            "  \n" +
            "Wow, yeah. That's great.\n" +
            "\n" +
            "  \n" +
            "Hey, Blart, they need you\n" +
            "at Victoria's Secret.\n" +
            "\n" +
            "  \n" +
            "Okay, roger that.\n" +
            "\n" +
            "  \n" +
            "Okay, I gotta go.\n" +
            "\n" +
            "  \n" +
            "Okay. Bye.\n" +
            "\n" +
            "  \n" +
            "- I found it first.\n" +
            "- No, you didn't.\n" +
            "\n" +
            "  \n" +
            "Ladies. Problem.\n" +
            "\n" +
            "  \n" +
            "What's the genesis?\n" +
            "\n" +
            "  \n" +
            "She's trying to take\n" +
            "the last push-up bra in this size.\n" +
            "\n" +
            "  \n" +
            "There's gonna be a new shipment tomorrow.\n" +
            "They'll be here by noon.\n" +
            "\n" +
            "  \n" +
            "Well, I need this one now.\n" +
            "I have a date tonight.\n" +
            "\n" +
            "  \n" +
            "Really? Is he blind?\n" +
            "\n" +
            "  \n" +
            "Whoa!\n" +
            "Waterproof shoes and Baggies on the socks.\n" +
            "\n" +
            "  \n" +
            "Not my first rodeo.\n" +
            "\n" +
            "  \n" +
            "Okay, ladies, need to see some ID.\n" +
            "\n" +
            "  \n" +
            "No, you don't.\n" +
            "\n" +
            "  \n" +
            "Ma'am, I should warn you, I do have\n" +
            "the authority to make a citizen's arrest.\n" +
            "\n" +
            "  \n" +
            "So does anyone.\n" +
            "I could arrest you right now.\n" +
            "\n" +
            "  \n" +
            "- That's true. She could.\n" +
            "- Hey, not talking to you. Okay?\n" +
            "\n" +
            "  \n" +
            "Can I see you for a second, please, ma'am?\n" +
            "\n" +
            "  \n" +
            "Look, I understand your sensitivity.\n" +
            "\n" +
            "  \n" +
            "I've had some issues with weight myself.\n" +
            "\n" +
            "  \n" +
            "- Are you calling me fat?\n" +
            "- No. No, no, no, no.\n" +
            "\n" +
            "  \n" +
            "I'm just saying I've been down that road.\n" +
            "\n" +
            "  \n" +
            "I mean... I mean, I'm still on it.\n" +
            "We both are, you know? Stranded.\n" +
            "\n" +
            "  \n" +
            "Let's face it, we eat to fill a void, right?\n" +
            "\n" +
            "  \n" +
            "But as soon as I started eating healthier,\n" +
            "\n" +
            "  \n" +
            "I noticed I wasn't so moody.\n" +
            "\n" +
            "  \n" +
            "And PS, your skin's gonna clear up.\n" +
            "\n" +
            "  \n" +
            "- Can you hold onto these?\n" +
            "- Sure.\n" +
            "\n" +
            "  \n" +
            "Ma'am.\n" +
            "\n" +
            "  \n" +
            "You...\n" +
            "\n" +
            "  \n" +
            "She's got tremendous upper body strength.\n" +
            "\n" +
            "  \n" +
            "Backup! Backup!\n" +
            "\n" +
            "  \n" +
            "She's biting my neck. She's biting my neck.\n" +
            "\n" +
            "  \n" +
            "Backup!\n" +
            "\n" +
            "  \n" +
            "Backup! Backup!\n" +
            "\n" +
            "  \n" +
            "Look, I know you're new here and all,\n" +
            "\n" +
            "  \n" +
            "but \"backup\" seems like\n" +
            "a pretty universal term.\n" +
            "\n" +
            "  \n" +
            "Hey. Can I give you a lift?\n" +
            "\n" +
            "  \n" +
            "What, on that?\n" +
            "\n" +
            "  \n" +
            "With an inexperienced driver\n" +
            "I would recommend no,\n" +
            "\n" +
            "  \n" +
            "but with me,\n" +
            "you'll be as safe as the President.\n" +
            "\n" +
            "  \n" +
            "I don't know. Couldn't that get you fired?\n" +
            "\n" +
            "  \n" +
            "Yes, it could.\n" +
            "\n" +
            "  \n" +
            "Okay.\n" +
            "\n" +
            "  \n" +
            "- Is this all right?\n" +
            "- Absolutely.\n" +
            "\n" +
            "  \n" +
            "And here you go. Safe and sound.\n" +
            "\n" +
            "  \n" +
            "- '65 Mustang.\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "Fun fact for you, a lot of people think\n" +
            "the Mustang was named after the horse.\n" +
            "\n" +
            "  \n" +
            "It was actually named after\n" +
            "the P-51 Mustang.\n" +
            "\n" +
            "  \n" +
            "- That's a plane.\n" +
            "- I didn't know that.\n" +
            "\n" +
            "  \n" +
            "Well, thank you for the ride, Paul.\n" +
            "That was so much fun.\n" +
            "\n" +
            "  \n" +
            "No problem.\n" +
            "\n" +
            "  \n" +
            "Listen,\n" +
            "\n" +
            "  \n" +
            "if you ever, you know, need rides anywhere,\n" +
            "\n" +
            "  \n" +
            "Dispatch, they can get me. You know.\n" +
            "\n" +
            "  \n" +
            "- Or we could just text each other.\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "- Yeah, give me your cell phone.\n" +
            "- My cell?\n" +
            "\n" +
            "  \n" +
            "Yeah, and I'll punch my number in.\n" +
            "\n" +
            "  \n" +
            "Left it in the casuals. You know what?\n" +
            "\n" +
            "  \n" +
            "Just give me your number\n" +
            "and I'll remember it.\n" +
            "\n" +
            "  \n" +
            "- Okay. Ready?\n" +
            "- Yep.\n" +
            "\n" +
            "  \n" +
            "- All right. 555...\n" +
            "- Not yet. Just...\n" +
            "\n" +
            "  \n" +
            "Now I'm ready.\n" +
            "\n" +
            "  \n" +
            "- 555...\n" +
            "- 555...\n" +
            "\n" +
            "  \n" +
            "...01...\n" +
            "...01...\n" +
            "\n" +
            "  \n" +
            "...78.\n" +
            "- Eight. Got it.\n" +
            "\n" +
            "  \n" +
            "That's it. It's locked.\n" +
            "\n" +
            "  \n" +
            "Great, so I'll see you tonight\n" +
            "at American Joe's, right?\n" +
            "\n" +
            "  \n" +
            "Yeah, I mean, everybody's going, so...\n" +
            "\n" +
            "  \n" +
            "- Yeah.\n" +
            "...why not me, too? I'll be...\n" +
            "\n" +
            "  \n" +
            "Yeah, I'm there.\n" +
            "\n" +
            "  \n" +
            "- Great. Bye.\n" +
            "- Okay. Bye.\n" +
            "\n" +
            "  \n" +
            "- Hey.\n" +
            "- Hey! Hey. Glad you made it, Paul.\n" +
            "\n" +
            "  \n" +
            "Good to be here.\n" +
            "\n" +
            "  \n" +
            "- Fun fact for you...\n" +
            "- This place sucks.\n" +
            "\n" +
            "  \n" +
            "- You want to get out of here?\n" +
            "- No.\n" +
            "\n" +
            "  \n" +
            "I'm sorry, what were you saying?\n" +
            "\n" +
            "  \n" +
            "No, I was just saying that\n" +
            "\n" +
            "  \n" +
            "the first American Joe's actually opened\n" +
            "its doors in 1972.\n" +
            "\n" +
            "  \n" +
            "And most people,\n" +
            "because of its service and theme,\n" +
            "\n" +
            "  \n" +
            "think that it's derivative of Abe and Louie's,\n" +
            "but it's not.\n" +
            "\n" +
            "  \n" +
            "It's its own thing.\n" +
            "\n" +
            "  \n" +
            "You really know a lot of facts, Paul.\n" +
            "\n" +
            "  \n" +
            "Hey, Blart, I heard you got your ass handed\n" +
            "to you by a fat chick at Victoria's Secret.\n" +
            "\n" +
            "  \n" +
            "Well, I don't hit women,\n" +
            "\n" +
            "  \n" +
            "- so I don't even know what...\n" +
            "- Yeah. Just minivans, right?\n" +
            "\n" +
            "  \n" +
            "Hey, why don't you go over to the bar\n" +
            "and grab yourself one of those girly drinks?\n" +
            "\n" +
            "  \n" +
            "- I'll meet you over there.\n" +
            "- Okay. Does anybody else want a drink?\n" +
            "\n" +
            "  \n" +
            "- 'Cause Stuart's buying.\n" +
            "- No, no, no. They're good. They're good.\n" +
            "\n" +
            "  \n" +
            "- So... They're good.\n" +
            "- Okay.\n" +
            "\n" +
            "  \n" +
            "Hey, listen, I...\n" +
            "We're basically already together, so...\n" +
            "\n" +
            "  \n" +
            "I wasn't... I didn't even realize that.\n" +
            "\n" +
            "  \n" +
            "- And I was... I wouldn't... Doing anything.\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "I just want you to grab a hold of it, tight.\n" +
            "\n" +
            "  \n" +
            "- Okay?\n" +
            "- I got it.\n" +
            "\n" +
            "  \n" +
            "I mean,\n" +
            "it's not like you really had a chance, okay?\n" +
            "\n" +
            "  \n" +
            "Security guard? Really.\n" +
            "\n" +
            "  \n" +
            "But you're a pen salesman, dude.\n" +
            "\n" +
            "  \n" +
            "Yeah, and I just bought a Camry,\n" +
            "so you can eat me.\n" +
            "\n" +
            "  \n" +
            "All right, bro. Back off.\n" +
            "You know, we're all just here having fun.\n" +
            "\n" +
            "  \n" +
            "Okay, bro.\n" +
            "\n" +
            "  \n" +
            "What?\n" +
            "\n" +
            "  \n" +
            "Hey, thanks\n" +
            "for getting my back there, brother.\n" +
            "\n" +
            "  \n" +
            "Security blood runs deep between...\n" +
            "Yeah, let's just go.\n" +
            "\n" +
            "  \n" +
            "- Round six.\n" +
            "- Let's do this thing.\n" +
            "\n" +
            "  \n" +
            "- Gentlemen ready?\n" +
            "- No.\n" +
            "\n" +
            "  \n" +
            "Not yet. Now I'm ready. Okay.\n" +
            "\n" +
            "  \n" +
            "And, go!\n" +
            "\n" +
            "  \n" +
            "Leon, I can't give you the Heimlich,\n" +
            "so you better chew.\n" +
            "\n" +
            "  \n" +
            "I know.\n" +
            "\n" +
            "  \n" +
            "Told you, boy. You better hurry up.\n" +
            "\n" +
            "  \n" +
            "There you go. Nachos in my face.\n" +
            "\n" +
            "  \n" +
            "Oh, my God. These peppers.\n" +
            "The peppers are hot.\n" +
            "\n" +
            "  \n" +
            "Oh, my God. Oh, that's a hot pepper.\n" +
            "\n" +
            "  \n" +
            "Nachos are good, man.\n" +
            "\n" +
            "  \n" +
            "Better inform all your friends, boy.\n" +
            "Nachos about to be gone.\n" +
            "\n" +
            "  \n" +
            "You're lagging behind.\n" +
            "\n" +
            "  \n" +
            "Come on, Paul. Playing games.\n" +
            "\n" +
            "  \n" +
            "I love these nachos, I'll tell you that much.\n" +
            "\n" +
            "  \n" +
            "- That lemonade is insane.\n" +
            "- Yeah, Paul.\n" +
            "\n" +
            "  \n" +
            "- That's because it's a margarita.\n" +
            "- No. I don't drink.\n" +
            "\n" +
            "  \n" +
            "Twist it.\n" +
            "\n" +
            "  \n" +
            "Feel the nub.\n" +
            "\n" +
            "  \n" +
            "- Hey, you want some? Here.\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "You want fruit?\n" +
            "\n" +
            "  \n" +
            "Bye! You blinked! You blinked.\n" +
            "\n" +
            "  \n" +
            "Time to pluck the grape from the vine.\n" +
            "\n" +
            "  \n" +
            "Still got the Baggies! Hot jiggity.\n" +
            "\n" +
            "  \n" +
            "Coming on the left.\n" +
            "\n" +
            "  \n" +
            "False alarm.\n" +
            "\n" +
            "  \n" +
            "Told my mom everything about us.\n" +
            "\n" +
            "  \n" +
            "What are you talking about?\n" +
            "\n" +
            "  \n" +
            "You're acting coy. Come on. It's natural.\n" +
            "\n" +
            "  \n" +
            "You know. You so know.\n" +
            "\n" +
            "  \n" +
            "No, I'm sorry, Paul. I don't know.\n" +
            "\n" +
            "  \n" +
            "Snap. Pop goes the weasel.\n" +
            "\n" +
            "  \n" +
            "So happy!\n" +
            "\n" +
            "  \n" +
            "Yeah!\n" +
            "\n" +
            "  \n" +
            "Yeah!\n" +
            "\n" +
            "  \n" +
            "I believe in magic!\n" +
            "\n" +
            "  \n" +
            "No way!\n" +
            "\n" +
            "  \n" +
            "I'm sorry it didn't work out, dear.\n" +
            "\n" +
            "  \n" +
            "It's fine, Ma.\n" +
            "\n" +
            "  \n" +
            "- Hey, Dad, why don't we check for matches?\n" +
            "- Yes.\n" +
            "\n" +
            "  \n" +
            "Yeah, I don't think so, sweetheart.\n" +
            "I think I'm just gonna turn in.\n" +
            "\n" +
            "  \n" +
            "Well, how about something special\n" +
            "for lunch tomorrow to cheer you up?\n" +
            "\n" +
            "  \n" +
            "I don't think so, Ma. It's fine.\n" +
            "\n" +
            "  \n" +
            "If something's gonna work,\n" +
            "it would be the sloppy joe.\n" +
            "\n" +
            "  \n" +
            "But that would probably... You know.\n" +
            "\n" +
            "  \n" +
            "You know, if you're doing the sloppy joe,\n" +
            "do the sweet potato fries.\n" +
            "\n" +
            "  \n" +
            "But it... Whatever, you know.\n" +
            "Well done. Yeah.\n" +
            "\n" +
            "  \n" +
            "Maya. Hey.\n" +
            "\n" +
            "  \n" +
            "Dad. I'm so sorry.\n" +
            "\n" +
            "  \n" +
            "It's okay.\n" +
            "\n" +
            "  \n" +
            "There are other fish in the sea.\n" +
            "\n" +
            "  \n" +
            "You just gotta keep looking.\n" +
            "\n" +
            "  \n" +
            "And it doesn't matter what you do.\n" +
            "\n" +
            "  \n" +
            "Because once someone takes the time\n" +
            "to get to know the real you,\n" +
            "\n" +
            "  \n" +
            "all bets are off.\n" +
            "\n" +
            "  \n" +
            "If it doesn't work out, you'll always have us.\n" +
            "\n" +
            "  \n" +
            "I'm sorry, sweetie, I popped my ears.\n" +
            "I didn't hear a word you were saying.\n" +
            "\n" +
            "  \n" +
            "You just have to...\n" +
            "\n" +
            "  \n" +
            "Is that a tattoo?\n" +
            "\n" +
            "  \n" +
            "I... Yeah, yeah, it is.\n" +
            "\n" +
            "  \n" +
            "When did you get it?\n" +
            "\n" +
            "  \n" +
            "- I got it last night.\n" +
            "- What is it?\n" +
            "\n" +
            "  \n" +
            "It's the Loch Ness monster.\n" +
            "\n" +
            "  \n" +
            "I don't drink.\n" +
            "\n" +
            "  \n" +
            "- Hey.\n" +
            "- Hi.\n" +
            "\n" +
            "  \n" +
            "That was\n" +
            "\n" +
            "  \n" +
            "a little weird the other night, huh?\n" +
            "\n" +
            "  \n" +
            "Yeah, you know, it had its moments. Yeah.\n" +
            "\n" +
            "  \n" +
            "Was one of them\n" +
            "when I tried to make out with your purse?\n" +
            "\n" +
            "  \n" +
            "You see, alcohol instantly turns to sugar\n" +
            "in the blood.\n" +
            "\n" +
            "  \n" +
            "And what happens is the capillaries...\n" +
            "\n" +
            "  \n" +
            "Yeah, look. A lot of people...\n" +
            "\n" +
            "  \n" +
            "Pretty much everybody, you know, tends\n" +
            "to write me off.\n" +
            "\n" +
            "  \n" +
            "And if you did, too, believe me, I get it.\n" +
            "\n" +
            "  \n" +
            "I just...\n" +
            "I guess what I'm asking is that you don't.\n" +
            "\n" +
            "  \n" +
            "Okay. You know, I'm sorry, I've just...\n" +
            "\n" +
            "  \n" +
            "I've gotta cash my paycheck\n" +
            "before the bank closes. I'm...\n" +
            "\n" +
            "  \n" +
            "No problem.\n" +
            "Maybe we could talk later or something?\n" +
            "\n" +
            "  \n" +
            "- Yeah, sure. You could just text me, or...\n" +
            "- Okay.\n" +
            "\n" +
            "  \n" +
            "- Yeah.\n" +
            "- I can do that. I can do that.\n" +
            "\n" +
            "  \n" +
            "You know, Paul, everybody texts these days.\n" +
            "\n" +
            "  \n" +
            "I can't believe you don't have a cell phone.\n" +
            "\n" +
            "  \n" +
            "I'm not about all this technology, Vijay.\n" +
            "\n" +
            "  \n" +
            "I prefer face-to-face interaction\n" +
            "or a nice handwritten sentiment.\n" +
            "\n" +
            "  \n" +
            "300 bucks?\n" +
            "\n" +
            "  \n" +
            "I dug myself into a really deep hole\n" +
            "with this girl, you gotta help me. Please.\n" +
            "\n" +
            "  \n" +
            "Paul, you've always been a straight shooter,\n" +
            "so I'll tell you what.\n" +
            "\n" +
            "  \n" +
            "Why don't you take my daughter\n" +
            "Parisa's phone?\n" +
            "\n" +
            "  \n" +
            "- No, I can't do that.\n" +
            "- No, no, no, no, no, no.\n" +
            "\n" +
            "  \n" +
            "I'm punishing her.\n" +
            "\n" +
            "  \n" +
            "No. What with all the parties\n" +
            "and that ex-boyfriend Pahud,\n" +
            "\n" +
            "  \n" +
            "she went over her minutes.\n" +
            "\n" +
            "  \n" +
            "When and if she decides to turn\n" +
            "her life around, I'll simply take it back.\n" +
            "\n" +
            "  \n" +
            "Until then, you use it.\n" +
            "\n" +
            "  \n" +
            "- Thanks.\n" +
            "- Sure.\n" +
            "\n" +
            "  \n" +
            "- Stay within the minutes.\n" +
            "- Of course.\n" +
            "\n" +
            "  \n" +
            "Hey. It's too late to go in that way, guys.\n" +
            "It's closed.\n" +
            "\n" +
            "  \n" +
            "- No one's going in there.\n" +
            "- Yeah. I think we are.\n" +
            "\n" +
            "  \n" +
            "Hey, yo, Paul. Come here, man.\n" +
            "\n" +
            "  \n" +
            "Look, I know you been feeling down,\n" +
            "so I got this for you.\n" +
            "\n" +
            "  \n" +
            "\"The Devil's Crotch.\"\n" +
            "\n" +
            "  \n" +
            "Feel the burn, baby.\n" +
            "\n" +
            "  \n" +
            "- Thanks, Leon.\n" +
            "- Get back at me, man.\n" +
            "\n" +
            "  \n" +
            "- Loading dock's ready.\n" +
            "- Got it.\n" +
            "\n" +
            "  \n" +
            "Yeah.\n" +
            "\n" +
            "  \n" +
            "You need a pen, don't you?\n" +
            "\n" +
            "  \n" +
            "You know what? No, I'm good.\n" +
            "\n" +
            "  \n" +
            "- I'll just use one of their pens.\n" +
            "- Yeah, you do.\n" +
            "\n" +
            "  \n" +
            "Yes. The Summit 5280 fountain.\n" +
            "\n" +
            "  \n" +
            "- That's stunning.\n" +
            "- Yeah, I know.\n" +
            "\n" +
            "  \n" +
            "How would you like to sign your name\n" +
            "with this panther?\n" +
            "\n" +
            "  \n" +
            "You know what? More than anything.\n" +
            "\n" +
            "  \n" +
            "- Yeah, that'd be great.\n" +
            "- Here. Yeah.\n" +
            "\n" +
            "  \n" +
            "It's yours. I insist.\n" +
            "\n" +
            "  \n" +
            "Oh, hey, guys.\n" +
            "\n" +
            "  \n" +
            "- Hey.\n" +
            "- Hey.\n" +
            "\n" +
            "  \n" +
            "- Hey.\n" +
            "- Don't you just love Fridays?\n" +
            "\n" +
            "  \n" +
            "- Yeah.\n" +
            "- Best night of the week.\n" +
            "\n" +
            "  \n" +
            "Yeah.\n" +
            "\n" +
            "  \n" +
            "- Excuse me. Sorry.\n" +
            "- Hey.\n" +
            "\n" +
            "  \n" +
            "Paul. Paul, can you help me out?\n" +
            "\n" +
            "  \n" +
            "I need to shoot over to the bank\n" +
            "for a minute.\n" +
            "\n" +
            "  \n" +
            "There's a few kids inside,\n" +
            "just finishing up their games.\n" +
            "\n" +
            "  \n" +
            "Could you close up the arcade for me?\n" +
            "\n" +
            "  \n" +
            "- Yeah, sure. No problem, Mr. Ferguson.\n" +
            "- Okay.\n" +
            "\n" +
            "  \n" +
            "- You okay? You seem a little down.\n" +
            "- Yeah, I'm fine.\n" +
            "\n" +
            "  \n" +
            "You know, video game might\n" +
            "cheer you right up.\n" +
            "\n" +
            "  \n" +
            "Nah, I'm on duty.\n" +
            "\n" +
            "  \n" +
            "Welcome to the games!\n" +
            "\n" +
            "  \n" +
            "Get set.\n" +
            "\n" +
            "  \n" +
            "Go.\n" +
            "\n" +
            "  \n" +
            "Foul. Foul.\n" +
            "\n" +
            "  \n" +
            "Foul. Foul.\n" +
            "\n" +
            "  \n" +
            "Foul. Foul.\n" +
            "\n" +
            "  \n" +
            "Foul. Foul. Foul. Foul.\n" +
            "\n" +
            "  \n" +
            "Game over.\n" +
            "\n" +
            "  \n" +
            "We are ready.\n" +
            "\n" +
            "  \n" +
            "Let's do this.\n" +
            "\n" +
            "  \n" +
            "Attention shoppers.\n" +
            "\n" +
            "  \n" +
            "Please make your way to the nearest exits.\n" +
            "\n" +
            "  \n" +
            "Unfortunately, the mall will be closing early.\n" +
            "\n" +
            "  \n" +
            "- Everybody out!\n" +
            "- Everybody out!\n" +
            "\n" +
            "  \n" +
            "Everybody out, now!\n" +
            "\n" +
            "  \n" +
            "You, too!\n" +
            "\n" +
            "  \n" +
            "Hi. Hey! Hey! You got me...\n" +
            "\n" +
            "  \n" +
            "I'm at the West Orange Pavilion Mall.\n" +
            "\n" +
            "  \n" +
            "Hey, yo. Hey, there's some crazy-ass people\n" +
            "trying to take over the mall.\n" +
            "\n" +
            "  \n" +
            "- I'm out of here.\n" +
            "- Everybody on the floor!\n" +
            "\n" +
            "  \n" +
            "Tell them to bring SWAT.\n" +
            "There may be hostages.\n" +
            "\n" +
            "  \n" +
            "What are you doing? Get down.\n" +
            "\n" +
            "  \n" +
            "Oh, my God.\n" +
            "\n" +
            "  \n" +
            "Surprised? I know.\n" +
            "\n" +
            "  \n" +
            "But here's the craziest part.\n" +
            "\n" +
            "  \n" +
            "I'm the leader.\n" +
            "\n" +
            "  \n" +
            "Reports are, they're inside the bank\n" +
            "and they got hostages.\n" +
            "\n" +
            "  \n" +
            "This is Sergeant Howard. I need four units\n" +
            "around the back to secure the perimeter.\n" +
            "\n" +
            "  \n" +
            "See if we can establish visual.\n" +
            "Report back to me immediately.\n" +
            "\n" +
            "  \n" +
            "Let's get all these civilians out of here.\n" +
            "\n" +
            "  \n" +
            "See if we can gain access\n" +
            "into the loading dock.\n" +
            "\n" +
            "  \n" +
            "- Go.\n" +
            "- I'm on it. 94, move 'em out.\n" +
            "\n" +
            "  \n" +
            "Hello?\n" +
            "\n" +
            "  \n" +
            "Feeling alive?\n" +
            "\n" +
            "  \n" +
            "I'm sorry?\n" +
            "\n" +
            "  \n" +
            "Parisa.\n" +
            "\n" +
            "  \n" +
            "She makes you feel alive, doesn't she?\n" +
            "\n" +
            "  \n" +
            "This must be Pahud.\n" +
            "Pahud, no, I'm not with Parisa.\n" +
            "\n" +
            "  \n" +
            "My name's Paul Blart.\n" +
            "\n" +
            "  \n" +
            "Parisa's dad took her cell phone away,\n" +
            "and he lent it to me.\n" +
            "\n" +
            "  \n" +
            "Do not lie to me, Paul Blart.\n" +
            "Do not lie to me.\n" +
            "\n" +
            "  \n" +
            "You are probably\n" +
            "sweating over her right now.\n" +
            "\n" +
            "  \n" +
            "I'm not lying.\n" +
            "\n" +
            "  \n" +
            "I mean, I am sweaty,\n" +
            "but I'm not sweating over anyone.\n" +
            "\n" +
            "  \n" +
            "That woman is like an angelic goddess\n" +
            "who only brings goodness to this world.\n" +
            "\n" +
            "  \n" +
            "Plus, she has some crazy sexy feet.\n" +
            "\n" +
            "  \n" +
            "Paul, the pain of this breakup\n" +
            "is far too much for me to bear, man.\n" +
            "\n" +
            "  \n" +
            "Pahud, no one can blame you\n" +
            "for being upset.\n" +
            "\n" +
            "  \n" +
            "I mean, the holidays are tough enough\n" +
            "without adding heartbreak to the mix.\n" +
            "\n" +
            "  \n" +
            "Wow. Them's some heavy words, Paul Blart.\n" +
            "\n" +
            "  \n" +
            "Hey, life is heavy.\n" +
            "\n" +
            "  \n" +
            "Indeed. Now, you are at the mall, huh?\n" +
            "\n" +
            "  \n" +
            "So why do you not head over\n" +
            "to Orange Julius,\n" +
            "\n" +
            "  \n" +
            "call up my friend Sameer Oh?\n" +
            "\n" +
            "  \n" +
            "Tell him you are now my homeboy.\n" +
            "He will hook you up.\n" +
            "\n" +
            "  \n" +
            "Wait a second.\n" +
            "How'd you know I was at the mall?\n" +
            "\n" +
            "  \n" +
            "I track Parisa's phone with GPS.\n" +
            "Don't you judge me.\n" +
            "\n" +
            "  \n" +
            "Closing time already.\n" +
            "\n" +
            "  \n" +
            "Okay, there are 223 stores in this mall.\n" +
            "\n" +
            "  \n" +
            "Here is a list of the 15 that I need you to hit.\n" +
            "\n" +
            "  \n" +
            "And 15 for you.\n" +
            "\n" +
            "  \n" +
            "Okay.\n" +
            "\n" +
            "  \n" +
            "Now this is the key to retrieve the codes\n" +
            "from each store's credit-card machine.\n" +
            "\n" +
            "  \n" +
            "They change every day, so make sure\n" +
            "\n" +
            "  \n" +
            "that you bring me back the codes\n" +
            "for today, Friday.\n" +
            "\n" +
            "  \n" +
            "Veck, six guys in standard formation,\n" +
            "just like you said.\n" +
            "\n" +
            "  \n" +
            "Perfect.\n" +
            "\n" +
            "  \n" +
            "Bomb! Bomb! Bomb! Bomb!\n" +
            "\n" +
            "  \n" +
            "And these little piggies went\n" +
            "all the way home.\n" +
            "\n" +
            "  \n" +
            "Do it.\n" +
            "\n" +
            "  \n" +
            "Gary usually delivers the leftovers\n" +
            "to the Mission.\n" +
            "\n" +
            "  \n" +
            "Hey, everyone. A couple requests.\n" +
            "\n" +
            "  \n" +
            "Kindly tie up the person beside you,\n" +
            "keep your mouths shut,\n" +
            "\n" +
            "  \n" +
            "give up your cell phones,\n" +
            "and as a general rule, do as I say.\n" +
            "\n" +
            "  \n" +
            "You do all these things...\n" +
            "Well, you'll be back at home in no time.\n" +
            "\n" +
            "  \n" +
            "Back to your mediocre lives.\n" +
            "\n" +
            "  \n" +
            "- I don't have one.\n" +
            "- Amy.\n" +
            "\n" +
            "  \n" +
            "I was hoping that you and I could have\n" +
            "a whole Bonnie-and-Clyde thing going on.\n" +
            "\n" +
            "  \n" +
            "You know, minus dying\n" +
            "in a hail of gunfire, of course.\n" +
            "\n" +
            "  \n" +
            "What do you say?\n" +
            "\n" +
            "  \n" +
            "Go to hell.\n" +
            "\n" +
            "  \n" +
            "Ouch.\n" +
            "\n" +
            "  \n" +
            "Hey, Stewie, you don't mind\n" +
            "that I'm hitting on your girlfriend, do you?\n" +
            "\n" +
            "  \n" +
            "What? No. She's not my girlfriend.\n" +
            "\n" +
            "  \n" +
            "But I specifically heard you say\n" +
            "that you two were \"basically together.\"\n" +
            "\n" +
            "  \n" +
            "No. I didn't say that we were together.\n" +
            "I said that she's into leather.\n" +
            "\n" +
            "  \n" +
            "Have at it. If you...\n" +
            "\n" +
            "  \n" +
            "God, you're an idiot.\n" +
            "\n" +
            "  \n" +
            "Hello?\n" +
            "\n" +
            "  \n" +
            "This is Sergeant Howard\n" +
            "of the West Orange Police Department.\n" +
            "\n" +
            "  \n" +
            "- Who am I speaking with?\n" +
            "- Hi.\n" +
            "\n" +
            "  \n" +
            "Yeah, well, so here's the deal.\n" +
            "\n" +
            "  \n" +
            "As you learned the hard way,\n" +
            "I have motion sensors by all the doors,\n" +
            "\n" +
            "  \n" +
            "so if you wanna enter my mall,\n" +
            "\n" +
            "  \n" +
            "you might as well bring\n" +
            "at least six body bags.\n" +
            "\n" +
            "  \n" +
            "He's drilling the safe,\n" +
            "and they have eyes on us.\n" +
            "\n" +
            "  \n" +
            "See if we can tap into the security cameras.\n" +
            "\n" +
            "  \n" +
            "Now look, no one's gonna try\n" +
            "and enter the mall.\n" +
            "\n" +
            "  \n" +
            "Is there anything you need? Do you need\n" +
            "any food? Do you need any water?\n" +
            "\n" +
            "  \n" +
            "Oh, man. This dude\n" +
            "doesn't deviate from the book at all.\n" +
            "\n" +
            "  \n" +
            "You know, since you're asking,\n" +
            "I would love a Happy Meal,\n" +
            "\n" +
            "  \n" +
            "you know, but...\n" +
            "Make sure the toy is the sea monster,\n" +
            "\n" +
            "  \n" +
            "'cause I already have the dragon.\n" +
            "\n" +
            "  \n" +
            "Okay, okay, now what is it you really want?\n" +
            "\n" +
            "  \n" +
            "Silence.\n" +
            "\n" +
            "  \n" +
            "Hey, I'm sorry, mall's closed,\n" +
            "\n" +
            "  \n" +
            "but I can help you find the nearest exit\n" +
            "if you just tell me where you parked.\n" +
            "\n" +
            "  \n" +
            "Sweet mercy.\n" +
            "\n" +
            "  \n" +
            "This is not happening,\n" +
            "this is not happening, this is...\n" +
            "\n" +
            "  \n" +
            "Oh, God. All right, think, Paul, think.\n" +
            "\n" +
            "  \n" +
            "Now what are you trained to do?\n" +
            "\n" +
            "  \n" +
            "Nothing.\n" +
            "\n" +
            "  \n" +
            "Detect, deter, observe, report.\n" +
            "I gotta report it. Reporting it.\n" +
            "\n" +
            "  \n" +
            "Yo, we got a straggler.\n" +
            "\n" +
            "  \n" +
            "- It's a security guard.\n" +
            "- What should we do?\n" +
            "\n" +
            "  \n" +
            "I don't know. Give up, I guess.\n" +
            "\n" +
            "  \n" +
            "Guys, what is wrong with you?\n" +
            "We stick to the plan.\n" +
            "\n" +
            "  \n" +
            "We got a 911 operator connecting us\n" +
            "with some guy named Paul Barth.\n" +
            "\n" +
            "  \n" +
            "He says he's a security officer in the mall.\n" +
            "\n" +
            "  \n" +
            "Hey. Blart? He's one of my guys.\n" +
            "\n" +
            "  \n" +
            "Paul, this is Sergeant Howard\n" +
            "of West Orange Police Department.\n" +
            "\n" +
            "  \n" +
            "The mall has been taken over,\n" +
            "and they have hostages.\n" +
            "\n" +
            "  \n" +
            "I need you to exit the building immediately.\n" +
            "\n" +
            "  \n" +
            "We don't need any wild cards\n" +
            "in this situation.\n" +
            "\n" +
            "  \n" +
            "Copy that. Never been a wild card.\n" +
            "\n" +
            "  \n" +
            "Unless you consider the game of Uno wild.\n" +
            "\n" +
            "  \n" +
            "- Blart! Can we focus here, please?\n" +
            "- Yes. Yes, sir. On my way out.\n" +
            "\n" +
            "  \n" +
            "Okay, okay. Come on, don't die. Don't die.\n" +
            "\n" +
            "  \n" +
            "Blart.\n" +
            "\n" +
            "  \n" +
            "Don't pee. Don't pee.\n" +
            "\n" +
            "  \n" +
            "Guys, motion detector just went off\n" +
            "at Door 26. Everybody on it.\n" +
            "\n" +
            "  \n" +
            "Amy.\n" +
            "\n" +
            "  \n" +
            "What the hell is he doing? Come on!\n" +
            "\n" +
            "  \n" +
            "- Paul, come on!\n" +
            "- Paulie, come on!\n" +
            "\n" +
            "  \n" +
            "- What's he doing?\n" +
            "- Come on, Blart!\n" +
            "\n" +
            "  \n" +
            "Blart, come on!\n" +
            "\n" +
            "  \n" +
            "- Let's go! Move it!\n" +
            "- Come on! Come on!\n" +
            "\n" +
            "  \n" +
            "- Get out of there!\n" +
            "- Come on!\n" +
            "\n" +
            "  \n" +
            "Is he crying?\n" +
            "\n" +
            "  \n" +
            "- I can't leave her.\n" +
            "- Where's he going?\n" +
            "\n" +
            "  \n" +
            "- Blart!\n" +
            "- Where's he going?\n" +
            "\n" +
            "  \n" +
            "Blart, get back! Will you talk to him, please?\n" +
            "\n" +
            "  \n" +
            "Blart, this is Brooks. What's going on?\n" +
            "\n" +
            "  \n" +
            "Sir, I took a sworn oath to protect this mall\n" +
            "and all inside it.\n" +
            "\n" +
            "  \n" +
            "What oath? We don't have an oath.\n" +
            "\n" +
            "  \n" +
            "I sort of made up my own.\n" +
            "It's on a plaque in my room.\n" +
            "\n" +
            "  \n" +
            "Listen, I think you're making a big mistake.\n" +
            "\n" +
            "  \n" +
            "SWAT's on the way.\n" +
            "\n" +
            "  \n" +
            "And I'm not gonna sugarcoat it,\n" +
            "you're untrained, you're unarmed,\n" +
            "\n" +
            "  \n" +
            "and let's face it, son,\n" +
            "you present a huge target.\n" +
            "\n" +
            "  \n" +
            "With all due respect, sir,\n" +
            "I can't observe and report from the outside.\n" +
            "\n" +
            "  \n" +
            "Over.\n" +
            "\n" +
            "  \n" +
            "Well, Sergeant,\n" +
            "looks like you got your eyes on the inside.\n" +
            "\n" +
            "  \n" +
            "Amy, Paul Blart here.\n" +
            "Are you still in the mall?\n" +
            "\n" +
            "  \n" +
            "Send.\n" +
            "\n" +
            "  \n" +
            "Got him.\n" +
            "\n" +
            "  \n" +
            "Oh, my God. Oh, God.\n" +
            "\n" +
            "  \n" +
            "Think. Think. Think, think, think,\n" +
            "think, think, think, think! Think!\n" +
            "\n" +
            "  \n" +
            "Hold it together.\n" +
            "\n" +
            "  \n" +
            "Heart of a warrior.\n" +
            "\n" +
            "  \n" +
            "I missed lunch.\n" +
            "\n" +
            "  \n" +
            "Thank you.\n" +
            "\n" +
            "  \n" +
            "This isn't happening, this is not happening.\n" +
            "\n" +
            "  \n" +
            "Hey! Don't make this hard.\n" +
            "\n" +
            "  \n" +
            "You like that?\n" +
            "\n" +
            "  \n" +
            "Brooks, I took out a girl,\n" +
            "but the guy, he ran away.\n" +
            "\n" +
            "  \n" +
            "- Wow, Paul, you got one.\n" +
            "- Yes.\n" +
            "\n" +
            "  \n" +
            "But let the record show,\n" +
            "I did not hit a woman. I just...\n" +
            "\n" +
            "  \n" +
            "I put all my weight on her.\n" +
            "\n" +
            "  \n" +
            "Oh, Paul.\n" +
            "\n" +
            "  \n" +
            "No, no, no. She's fine, she's fine.\n" +
            "\n" +
            "  \n" +
            "Well, good, let's get you out of there.\n" +
            "\n" +
            "  \n" +
            "No can do, sir.\n" +
            "I am gonna finish what I started.\n" +
            "\n" +
            "  \n" +
            "What the heck is this?\n" +
            "\n" +
            "  \n" +
            "Give me that.\n" +
            "\n" +
            "  \n" +
            "Paul, this is Sergeant Howard again.\n" +
            "\n" +
            "  \n" +
            "Since you refuse to come out,\n" +
            "I'm gonna need you to go into the bank\n" +
            "\n" +
            "  \n" +
            "and find out\n" +
            "where they're holding the hostages.\n" +
            "\n" +
            "  \n" +
            "With honor, sir.\n" +
            "\n" +
            "  \n" +
            "Good to know.\n" +
            "\n" +
            "  \n" +
            "Hey, I haven't heard back\n" +
            "from Donner or Vixen.\n" +
            "\n" +
            "  \n" +
            "Okay. I'm calling an audible here, everyone.\n" +
            "\n" +
            "  \n" +
            "And I need to get this mall locked down\n" +
            "from the inside immediately.\n" +
            "\n" +
            "  \n" +
            "Why don't we just start wasting hostages?\n" +
            "That'll stop them.\n" +
            "\n" +
            "  \n" +
            "Well, that's one way to go, but our hostages\n" +
            "are the only thing keeping the cops outside.\n" +
            "\n" +
            "  \n" +
            "I'm Commander Kent. My team is deploying.\n" +
            "I need this location secured.\n" +
            "\n" +
            "  \n" +
            "- We got a three-block perimeter...\n" +
            "- Establish a perimeter\n" +
            "\n" +
            "  \n" +
            "and get all these people out of here.\n" +
            "\n" +
            "  \n" +
            "Whoa, whoa, this is all done already.\n" +
            "\n" +
            "  \n" +
            "My men are gonna do it again, the right way.\n" +
            "\n" +
            "  \n" +
            "Have your guys fall back, now.\n" +
            "Have there been any demands?\n" +
            "\n" +
            "  \n" +
            "- A Happy Meal and absolute silence.\n" +
            "- Well, let's make some noise.\n" +
            "\n" +
            "  \n" +
            "I got snipers at the ready,\n" +
            "communications in check.\n" +
            "\n" +
            "  \n" +
            "Let's tap into security now,\n" +
            "and let's get some visuals.\n" +
            "\n" +
            "  \n" +
            "You can't.\n" +
            "They knocked out the video cameras.\n" +
            "\n" +
            "  \n" +
            "I'll be ready to take on-scene command\n" +
            "in three, two, one. I'm in charge.\n" +
            "\n" +
            "  \n" +
            "Brooks, I'm observing the bank now.\n" +
            "\n" +
            "  \n" +
            "They got one assailant\n" +
            "guarding the hostages.\n" +
            "\n" +
            "  \n" +
            "There she is.\n" +
            "\n" +
            "  \n" +
            "My, God. You are my angel pie.\n" +
            "\n" +
            "  \n" +
            "Here come the love sweats.\n" +
            "\n" +
            "  \n" +
            "Paul, your radio's still on.\n" +
            "\n" +
            "  \n" +
            "Roger that.\n" +
            "\n" +
            "  \n" +
            "- What's going on? Who is that?\n" +
            "- We got a guy on the inside.\n" +
            "\n" +
            "  \n" +
            "Don't tell me one of your beat cops\n" +
            "is trying to be a hero.\n" +
            "\n" +
            "  \n" +
            "No, he's neither. His name is Blart.\n" +
            "He's one of my security guards.\n" +
            "\n" +
            "  \n" +
            "- Wait a minute. Blart?\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "- Paul Blart?\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "Are you kidding me? We used to abuse\n" +
            "that loser in high school. Give me that.\n" +
            "\n" +
            "  \n" +
            "Blart.\n" +
            "\n" +
            "  \n" +
            "This is Commander James Kent.\n" +
            "New Jersey SWAT.\n" +
            "\n" +
            "  \n" +
            "We went to high school together.\n" +
            "Remember?\n" +
            "\n" +
            "  \n" +
            "I set you on fire at the pancake festival?\n" +
            "\n" +
            "  \n" +
            "Oh, yeah. Hey, Jimmy.\n" +
            "\n" +
            "  \n" +
            "Go Green Hawks.\n" +
            "\n" +
            "  \n" +
            "Yeah, listen. I've got 50 highly trained,\n" +
            "armed professionals out here.\n" +
            "\n" +
            "  \n" +
            "At my command,\n" +
            "we are retaking this location,\n" +
            "\n" +
            "  \n" +
            "and there's no way I'm compromising\n" +
            "this mission so that some mall monitor\n" +
            "\n" +
            "  \n" +
            "who used to eat lunch\n" +
            "with his imaginary friend can screw it up.\n" +
            "\n" +
            "  \n" +
            "Sorry, Jimmy, I had the button pressed.\n" +
            "All I heard was \"lunch\" and \"friend.\"\n" +
            "\n" +
            "  \n" +
            "Could you do me a favor\n" +
            "and put Chief Brooks back on?\n" +
            "\n" +
            "  \n" +
            "Listen to me, Blart,\n" +
            "\n" +
            "  \n" +
            "you are no longer communicating\n" +
            "with Chief Brooks. Is that clear?\n" +
            "\n" +
            "  \n" +
            "Hello?\n" +
            "\n" +
            "  \n" +
            "Hello?\n" +
            "\n" +
            "  \n" +
            "Yeah? Oh, hey, Paul, how you doing?\n" +
            "\n" +
            "  \n" +
            "Well, it looks like they moved the hostages\n" +
            "into the teller area.\n" +
            "\n" +
            "  \n" +
            "I'm gonna get a closer look.\n" +
            "\n" +
            "  \n" +
            "Veck.\n" +
            "\n" +
            "  \n" +
            "There he is!\n" +
            "\n" +
            "  \n" +
            "- Everyone in the back room, now!\n" +
            "- Come on, move, move!\n" +
            "\n" +
            "  \n" +
            "Let's get in the back, huh?\n" +
            "\n" +
            "  \n" +
            "Brooks. I lost visual on the hostages.\n" +
            "I couldn't get them out.\n" +
            "\n" +
            "  \n" +
            "But I know who the leader is. It's Veck.\n" +
            "\n" +
            "  \n" +
            "Veck? The trainee?\n" +
            "\n" +
            "  \n" +
            "- No. The brainee.\n" +
            "- I don't believe this.\n" +
            "\n" +
            "  \n" +
            "I'll pass it on to Howard.\n" +
            "\n" +
            "  \n" +
            "Oh, God.\n" +
            "\n" +
            "  \n" +
            "Trapped is fine by me.\n" +
            "\n" +
            "  \n" +
            "Commence tanning. Three, two, one.\n" +
            "\n" +
            "  \n" +
            "Yeah!\n" +
            "\n" +
            "  \n" +
            "Yes!\n" +
            "\n" +
            "  \n" +
            "Time for some big-game hunting.\n" +
            "\n" +
            "  \n" +
            "Open, open, open! Thank God.\n" +
            "\n" +
            "  \n" +
            "Oh, no.\n" +
            "\n" +
            "  \n" +
            "Sir! Sir! Sir! Sir! Sir! Sir! We get it!\n" +
            "\n" +
            "  \n" +
            "Get him! Get him! Get him!\n" +
            "\n" +
            "  \n" +
            "You better run.\n" +
            "\n" +
            "  \n" +
            "- Rudolph, where are you?\n" +
            "- I'm about to end this.\n" +
            "\n" +
            "  \n" +
            "Amy, huh? What a coincidence.\n" +
            "\n" +
            "  \n" +
            "We got a cute little redhead\n" +
            "down at the bank named Amy.\n" +
            "\n" +
            "  \n" +
            "- Strawberry blonde, actually.\n" +
            "- Yeah?\n" +
            "\n" +
            "  \n" +
            "Well, I guess I know who I'm killing first.\n" +
            "\n" +
            "  \n" +
            "- Catch you later!\n" +
            "- Yeah?\n" +
            "\n" +
            "  \n" +
            "Well, it looks like you just ran out of mall.\n" +
            "\n" +
            "  \n" +
            "It'll be over quick. She won't feel a thing.\n" +
            "\n" +
            "  \n" +
            "You aren't gonna touch her,\n" +
            "but you are gonna feel this.\n" +
            "\n" +
            "  \n" +
            "Nobody wins with a head butt.\n" +
            "\n" +
            "  \n" +
            "- Give me your cell phone.\n" +
            "- I don't have one.\n" +
            "\n" +
            "  \n" +
            "What are you talking about?\n" +
            "Every kid has a cell phone.\n" +
            "\n" +
            "  \n" +
            "I prefer handwritten sentiments.\n" +
            "\n" +
            "  \n" +
            "Who are these sloppy joes for?\n" +
            "And who gave you this?\n" +
            "\n" +
            "  \n" +
            "They're mine.\n" +
            "I'm late for my shift at Foot Locker.\n" +
            "\n" +
            "  \n" +
            "We're getting the leader on the horn.\n" +
            "He wants to talk to you.\n" +
            "\n" +
            "  \n" +
            "Silence, my ass.\n" +
            "\n" +
            "  \n" +
            "What's the matter?\n" +
            "Throw a few jabs your way,\n" +
            "\n" +
            "  \n" +
            "you curl up in a corner, suck your thumb?\n" +
            "\n" +
            "  \n" +
            "If you don't go toe-to-toe\n" +
            "with that scumbag,\n" +
            "\n" +
            "  \n" +
            "he's gonna roll over on you all night long.\n" +
            "\n" +
            "  \n" +
            "It's all right. That's not my style.\n" +
            "\n" +
            "  \n" +
            "Well, just in case, I wrote down\n" +
            "a couple of clever comebacks, like...\n" +
            "\n" +
            "  \n" +
            "Here.\n" +
            "\n" +
            "  \n" +
            "This is what you been doing?\n" +
            "\n" +
            "  \n" +
            "\"Yeah, you and what army?\"\n" +
            "\n" +
            "  \n" +
            "- What's wrong with that?\n" +
            "- He has an army.\n" +
            "\n" +
            "  \n" +
            "Everyone deserves a card on their birthday.\n" +
            "\n" +
            "  \n" +
            "So when you and Rudolph\n" +
            "were laughing it up back at the crib\n" +
            "\n" +
            "  \n" +
            "about how easy all this was gonna be,\n" +
            "were you guys like,\n" +
            "\n" +
            "  \n" +
            "\"Man, any brain-dead mall cop\n" +
            "that gets in the way is gonna get smoked\"?\n" +
            "\n" +
            "  \n" +
            "And then... And then what?\n" +
            "You guys all high-fived?\n" +
            "\n" +
            "  \n" +
            "- Veck, this guard is...\n" +
            "- Winning! I know this, because I am all set!\n" +
            "\n" +
            "  \n" +
            "But sadly, no codes!\n" +
            "\n" +
            "  \n" +
            "And I'd say, considering\n" +
            "all the luxury items that I have stacked up\n" +
            "\n" +
            "  \n" +
            "in my Amazon shopping cart,\n" +
            "situation unacceptable!\n" +
            "\n" +
            "  \n" +
            "No, no, no, no, no, no. He looking.\n" +
            "\n" +
            "  \n" +
            "Give me a gun.\n" +
            "\n" +
            "  \n" +
            "Put it down. Put it down.\n" +
            "\n" +
            "  \n" +
            "What are you nodding about?\n" +
            "\n" +
            "  \n" +
            "I was just wondering,\n" +
            "were you serious about that Happy Meal?\n" +
            "\n" +
            "  \n" +
            "It isn't coming, is it?\n" +
            "\n" +
            "  \n" +
            "What?\n" +
            "\n" +
            "  \n" +
            "This is Commander James Kent,\n" +
            "New Jersey SWAT.\n" +
            "\n" +
            "  \n" +
            "You wanted to speak to me?\n" +
            "\n" +
            "  \n" +
            "I just wanna make sure\n" +
            "that no one does anything stupid.\n" +
            "\n" +
            "  \n" +
            "You should know my men are deployed\n" +
            "and ready to bring this thing to a resolution.\n" +
            "\n" +
            "  \n" +
            "The easy way or the hard way.\n" +
            "\n" +
            "  \n" +
            "That is such a tough call, but...\n" +
            "\n" +
            "  \n" +
            "Yeah, I'm gonna go ahead and go with C,\n" +
            "none of the above!\n" +
            "\n" +
            "  \n" +
            "I'm Amy, by the way.\n" +
            "\n" +
            "  \n" +
            "- Amy? From unbeWEAVEable?\n" +
            "- Yeah.\n" +
            "\n" +
            "  \n" +
            "I'm Maya.\n" +
            "My father talked forever about you.\n" +
            "\n" +
            "  \n" +
            "And I gotta say, he really does like you.\n" +
            "\n" +
            "  \n" +
            "I'm gonna throw up.\n" +
            "\n" +
            "  \n" +
            "Oh, that's not so bad.\n" +
            "\n" +
            "  \n" +
            "Oh, my God.\n" +
            "\n" +
            "  \n" +
            "They've got his daughter.\n" +
            "\n" +
            "  \n" +
            "- Dad?\n" +
            "- Maya.\n" +
            "\n" +
            "  \n" +
            "- Everything's gonna be okay.\n" +
            "- How's your blood sugar?\n" +
            "\n" +
            "  \n" +
            "Don't worry about me, okay?\n" +
            "I'm worried about you.\n" +
            "\n" +
            "  \n" +
            "I love you.\n" +
            "All right, now, I'm gonna get you all out.\n" +
            "\n" +
            "  \n" +
            "You just hang in there, okay, sweetie?\n" +
            "\n" +
            "  \n" +
            "I will. I'm a Blart, remember?\n" +
            "\n" +
            "  \n" +
            "Yeah. I'll see you soon.\n" +
            "\n" +
            "  \n" +
            "I'm supposed to be on my way\n" +
            "to the Cayman Islands with the hostages.\n" +
            "\n" +
            "  \n" +
            "And where the hell is Rudolph?\n" +
            "He should be back by now.\n" +
            "\n" +
            "  \n" +
            "\"If Veck gets the codes,\n" +
            "he's taking us to Cayman Islands\"?\n" +
            "\n" +
            "  \n" +
            "Well, Veck Sims, welcome to the show.\n" +
            "\n" +
            "  \n" +
            "Come and get me, Veck.\n" +
            "\n" +
            "  \n" +
            "I got your codes\n" +
            "for the credit-card machines.\n" +
            "\n" +
            "  \n" +
            "- Yo, you hear that? That's Paul, baby!\n" +
            "- Blart?\n" +
            "\n" +
            "  \n" +
            "That's who's been screwing all this up?\n" +
            "You have got to be kidding me.\n" +
            "\n" +
            "  \n" +
            "Give me a radio.\n" +
            "\n" +
            "  \n" +
            "Let me tell you something.\n" +
            "\n" +
            "  \n" +
            "You take hostages in my mall,\n" +
            "you are making a big mistake.\n" +
            "\n" +
            "  \n" +
            "You seriously undermissed...\n" +
            "\n" +
            "  \n" +
            "And you seriously...\n" +
            "\n" +
            "  \n" +
            "Oh, no!\n" +
            "\n" +
            "  \n" +
            "Blart?\n" +
            "\n" +
            "  \n" +
            "Sugar. Sugar.\n" +
            "\n" +
            "  \n" +
            "Blart? You there, Blart?\n" +
            "\n" +
            "  \n" +
            "Hello, Blart. You there?\n" +
            "\n" +
            "  \n" +
            "Hey, Blart!\n" +
            "\n" +
            "  \n" +
            "I was hoping we could get an ETA\n" +
            "of when you're gonna give up.\n" +
            "\n" +
            "  \n" +
            "How about now?\n" +
            "\n" +
            "  \n" +
            "I'll meet you on the corner of Ne and Ver.\n" +
            "\n" +
            "  \n" +
            "Yeah, you heard me. Never!\n" +
            "\n" +
            "  \n" +
            "All right, Dad.\n" +
            "\n" +
            "  \n" +
            "Hey, fellas! You looking for me?\n" +
            "\n" +
            "  \n" +
            "Come on. Come on, come on. Come on.\n" +
            "\n" +
            "  \n" +
            "Follow me.\n" +
            "\n" +
            "  \n" +
            "There he is.\n" +
            "\n" +
            "  \n" +
            "We got him trapped in Rainforest Cafe.\n" +
            "\n" +
            "  \n" +
            "Great. Wait for me.\n" +
            "You know, my mom always said,\n" +
            "\n" +
            "  \n" +
            "\"If you want something done right,\n" +
            "waste the guy yourself.\"\n" +
            "\n" +
            "  \n" +
            "I'm paraphrasing, of course. You stay here.\n" +
            "\n" +
            "  \n" +
            "Prancer, take the back.\n" +
            "\n" +
            "  \n" +
            "Hey, you. Scuba Dooby-Doo.\n" +
            "\n" +
            "  \n" +
            "Hey, hey, hey, hey, hey.\n" +
            "Can I have my codes now, please?\n" +
            "\n" +
            "  \n" +
            "Why? No codes, no Cayman Islands?\n" +
            "\n" +
            "  \n" +
            "Looks like Paul Blart turned into\n" +
            "quite the badass.\n" +
            "\n" +
            "  \n" +
            "Whoa, whoa, whoa. Relax.\n" +
            "\n" +
            "  \n" +
            "No.\n" +
            "\n" +
            "  \n" +
            "One thing I know is\n" +
            "Paul Blart is not a badass.\n" +
            "\n" +
            "  \n" +
            "Comet! Don't come back till he's dead!\n" +
            "\n" +
            "  \n" +
            "Brooks. Only one more left.\n" +
            "Then it's just me and Veck.\n" +
            "\n" +
            "  \n" +
            "Okay, who's talking to Blart?\n" +
            "\n" +
            "  \n" +
            "Was it you, sugar mouth?\n" +
            "\n" +
            "  \n" +
            "All right. Let's try this again.\n" +
            "\n" +
            "  \n" +
            "Wait! No, no, no! No, no, no, no, no!\n" +
            "\n" +
            "  \n" +
            "It's her phone, it's hers.\n" +
            "She's talking to him.\n" +
            "\n" +
            "  \n" +
            "She's talking to him, and I told her not to.\n" +
            "And it's under her leg.\n" +
            "\n" +
            "  \n" +
            "The phone. Her right leg. Right there.\n" +
            "That's good.\n" +
            "\n" +
            "  \n" +
            "Okay.\n" +
            "\n" +
            "  \n" +
            "That was close.\n" +
            "\n" +
            "  \n" +
            "He is a pro.\n" +
            "\n" +
            "  \n" +
            "Listen, Blart, time's up. We're busting in.\n" +
            "\n" +
            "  \n" +
            "Wait! Look, Veck's after\n" +
            "the credit-card codes, and I got them.\n" +
            "\n" +
            "  \n" +
            "Just give me a few minutes.\n" +
            "\n" +
            "  \n" +
            "No problem.\n" +
            "\n" +
            "  \n" +
            "Isn't that cute?\n" +
            "\n" +
            "  \n" +
            "- Hey, Amy. I'm on my way.\n" +
            "- Oh, hey, Blart.\n" +
            "\n" +
            "  \n" +
            "Wow. Our boy Stuart just turned me on\n" +
            "to your profile\n" +
            "\n" +
            "  \n" +
            "on lonelyloser.com.\n" +
            "\n" +
            "  \n" +
            "\"Likes morning rain, walks on the beach.\"\n" +
            "\n" +
            "  \n" +
            "Who are you, Olivia Newton-John?\n" +
            "\n" +
            "  \n" +
            "I was just speaking from the heart.\n" +
            "\n" +
            "  \n" +
            "Yeah, well, I didn't have to go online, Paul,\n" +
            "to know that you love peanut brittle.\n" +
            "\n" +
            "  \n" +
            "You're so pathetic.\n" +
            "\n" +
            "  \n" +
            "Trippy.\n" +
            "\n" +
            "  \n" +
            "This I can use.\n" +
            "\n" +
            "  \n" +
            "What do you want, Veck?\n" +
            "\n" +
            "  \n" +
            "I just want the $30 million\n" +
            "that I came here for.\n" +
            "\n" +
            "  \n" +
            "But, you know, I would settle offing\n" +
            "your dream girl, or maybe your daughter.\n" +
            "\n" +
            "  \n" +
            "You touch them, I swear I'll end you.\n" +
            "\n" +
            "  \n" +
            "What're you gonna do, Paul?\n" +
            "\n" +
            "  \n" +
            "You gonna pull up with your left hip forward\n" +
            "giving the illusion that you have a gun,\n" +
            "\n" +
            "  \n" +
            "which you and I both know you don't?\n" +
            "\n" +
            "  \n" +
            "- I could.\n" +
            "- You're not gonna do squat.\n" +
            "\n" +
            "  \n" +
            "The next time I see you, Paul,\n" +
            "I'm gonna put a bullet in your head.\n" +
            "\n" +
            "  \n" +
            "I don't think so. I'm taking you down.\n" +
            "\n" +
            "  \n" +
            "Blart!\n" +
            "\n" +
            "  \n" +
            "Oh, Blart.\n" +
            "\n" +
            "  \n" +
            "Sweet mercy.\n" +
            "\n" +
            "  \n" +
            "I wish I had a bat. I would bust you open,\n" +
            "see how much candy fell out.\n" +
            "\n" +
            "  \n" +
            "- Too tight!\n" +
            "- This is not happening.\n" +
            "\n" +
            "  \n" +
            "- It's not happening.\n" +
            "- Come on.\n" +
            "\n" +
            "  \n" +
            "Bravo. That was awesome.\n" +
            "\n" +
            "  \n" +
            "And you were just so close\n" +
            "to making it, too, Paul. Just so close.\n" +
            "\n" +
            "  \n" +
            "- It's not over yet.\n" +
            "- Yeah, I think it is.\n" +
            "\n" +
            "  \n" +
            "Now the only thing I need are my codes,\n" +
            "which, judging from your text messages,\n" +
            "\n" +
            "  \n" +
            "you have been so sweet as to enter them\n" +
            "into your phone just for me.\n" +
            "\n" +
            "  \n" +
            "You think I'm gonna carry the phone\n" +
            "with me that actually contains the...\n" +
            "\n" +
            "  \n" +
            "- Yello?\n" +
            "- Peanut Blart and Jelly.\n" +
            "\n" +
            "  \n" +
            "What's up, man?\n" +
            "So good to hear your voice.\n" +
            "\n" +
            "  \n" +
            "Yeah, it's good to hear\n" +
            "your voice, too, Pahud.\n" +
            "\n" +
            "  \n" +
            "Listen, I'm gonna have to call you back.\n" +
            "\n" +
            "  \n" +
            "- What? When?\n" +
            "- I don't know when. I'll talk to you later.\n" +
            "\n" +
            "  \n" +
            "Okay, Paul, call me back!\n" +
            "Call me back, Paul!\n" +
            "\n" +
            "  \n" +
            "I mean,\n" +
            "this just keeps getting better and better.\n" +
            "\n" +
            "  \n" +
            "I mean, you are impossible\n" +
            "to underestimate.\n" +
            "\n" +
            "  \n" +
            "I mean, you can't pass the trooper exam,\n" +
            "\n" +
            "  \n" +
            "you black out if you don't have\n" +
            "a Snickers bar like every 20 minutes,\n" +
            "\n" +
            "  \n" +
            "you had the chance to be the MVP,\n" +
            "and you blew it.\n" +
            "\n" +
            "  \n" +
            "Again, like you always do.\n" +
            "Ain't that right, Maya?\n" +
            "\n" +
            "  \n" +
            "What do you want me to say, Veck?\n" +
            "You're smarter than me.\n" +
            "\n" +
            "  \n" +
            "You're good on computers,\n" +
            "you kept your weight under control.\n" +
            "\n" +
            "  \n" +
            "I mean, people,\n" +
            "they look at me and you, and...\n" +
            "\n" +
            "  \n" +
            "Yeah, it's a landslide.\n" +
            "\n" +
            "  \n" +
            "It's no contest.\n" +
            "\n" +
            "  \n" +
            "Sorry.\n" +
            "\n" +
            "  \n" +
            "Right now, you're the man with the gun.\n" +
            "\n" +
            "  \n" +
            "So here you go.\n" +
            "\n" +
            "  \n" +
            "Come on!\n" +
            "\n" +
            "  \n" +
            "Go get him!\n" +
            "\n" +
            "  \n" +
            "Go, Dad.\n" +
            "\n" +
            "  \n" +
            "What...\n" +
            "\n" +
            "  \n" +
            "Probably should have capitalized on that.\n" +
            "\n" +
            "  \n" +
            "Dad!\n" +
            "\n" +
            "  \n" +
            "Lock and load, boys. We're going in.\n" +
            "\n" +
            "  \n" +
            "Hey, we're on the move.\n" +
            "\n" +
            "  \n" +
            "Let's go.\n" +
            "\n" +
            "  \n" +
            "Come on, come on, come on.\n" +
            "\n" +
            "  \n" +
            "Paul. Think, Paul. Think!\n" +
            "\n" +
            "  \n" +
            "Let's go, men. Take it down.\n" +
            "Secure the suspects.\n" +
            "\n" +
            "  \n" +
            "Get down!\n" +
            "\n" +
            "  \n" +
            "Hold your fire! Hold your fire!\n" +
            "\n" +
            "  \n" +
            "Down. The other one. That's the back one.\n" +
            "\n" +
            "  \n" +
            "No, no. That's the same one. No!\n" +
            "The other one!\n" +
            "\n" +
            "  \n" +
            "Veck got away with my daughter and Amy.\n" +
            "\n" +
            "  \n" +
            "Entry team, clear the mall. We'll pursue.\n" +
            "\n" +
            "  \n" +
            "Light.\n" +
            "\n" +
            "  \n" +
            "Open the door.\n" +
            "\n" +
            "  \n" +
            "Let's do this.\n" +
            "\n" +
            "  \n" +
            "Jimmy, give me your cell phone.\n" +
            "\n" +
            "  \n" +
            "Gotta hand it to you, Blart.\n" +
            "You're really taking care of business.\n" +
            "\n" +
            "  \n" +
            "What up?\n" +
            "\n" +
            "  \n" +
            "Pahud, do you still have GPS\n" +
            "on Parisa's cell phone?\n" +
            "\n" +
            "  \n" +
            "You know I do, Paul. You know I do.\n" +
            "What can I do for you?\n" +
            "\n" +
            "  \n" +
            "I need to know where it's headed.\n" +
            "\n" +
            "  \n" +
            "Paul, it looks like\n" +
            "they're on their way to McGuire Airfield.\n" +
            "\n" +
            "  \n" +
            "I know where that is. Thanks.\n" +
            "\n" +
            "  \n" +
            "Hang on.\n" +
            "\n" +
            "  \n" +
            "My God. There they are.\n" +
            "Jimmy, take the wheel.\n" +
            "\n" +
            "  \n" +
            "What?\n" +
            "\n" +
            "  \n" +
            "Here we go! Here we go!\n" +
            "\n" +
            "  \n" +
            "That was me. I can't...\n" +
            "\n" +
            "  \n" +
            "Here I go! No!\n" +
            "\n" +
            "  \n" +
            "Blart!\n" +
            "\n" +
            "  \n" +
            "Don't do it! Blart!\n" +
            "\n" +
            "  \n" +
            "Oh, God. Oh, God.\n" +
            "\n" +
            "  \n" +
            "Maya! Maya, get inside.\n" +
            "\n" +
            "  \n" +
            "- Oh, God!\n" +
            "- Dad!\n" +
            "\n" +
            "  \n" +
            "Paul?\n" +
            "\n" +
            "  \n" +
            "I really don't drink.\n" +
            "\n" +
            "  \n" +
            "Come on. Oh, yeah?\n" +
            "\n" +
            "  \n" +
            "- Dad!\n" +
            "- Come on.\n" +
            "\n" +
            "  \n" +
            "Dad!\n" +
            "\n" +
            "  \n" +
            "Man, that hypoglycemia is a killer.\n" +
            "\n" +
            "  \n" +
            "I told you I'd take you down.\n" +
            "\n" +
            "  \n" +
            "Blart!\n" +
            "\n" +
            "  \n" +
            "Very impressive,\n" +
            "taking down an assailant without a gun.\n" +
            "\n" +
            "  \n" +
            "I hope you don't mind if I use one.\n" +
            "\n" +
            "  \n" +
            "What?\n" +
            "\n" +
            "  \n" +
            "- Oh, no.\n" +
            "- Oh, yeah.\n" +
            "\n" +
            "  \n" +
            "I guess\n" +
            "it's off to the Cayman Islands then, huh?\n" +
            "\n" +
            "  \n" +
            "Soon as I get my money.\n" +
            "\n" +
            "  \n" +
            "Yeah, well, you'll be needing this.\n" +
            "\n" +
            "  \n" +
            "Just give it to him, Dad.\n" +
            "\n" +
            "  \n" +
            "Oh, I will. Suck on that!\n" +
            "\n" +
            "  \n" +
            "Okay. Situation update?\n" +
            "\n" +
            "  \n" +
            "We have seven assailants in custody, sir.\n" +
            "\n" +
            "  \n" +
            "- Great. Nobody talks to them but me.\n" +
            "- Yes, sir.\n" +
            "\n" +
            "  \n" +
            "You see, jackass? I don't need the phone.\n" +
            "\n" +
            "  \n" +
            "'Cause I got all the access codes\n" +
            "written on their arm.\n" +
            "\n" +
            "  \n" +
            "Now, I kill you three,\n" +
            "there'll be no witnesses.\n" +
            "\n" +
            "  \n" +
            "And since everybody thinks\n" +
            "this was a bank...\n" +
            "\n" +
            "  \n" +
            "I got a newsflash for you.\n" +
            "Your flight's been canceled.\n" +
            "\n" +
            "  \n" +
            "That's better than anything I got.\n" +
            "\n" +
            "  \n" +
            "You did good, Dad.\n" +
            "\n" +
            "  \n" +
            "Yeah, I am pretty great.\n" +
            "\n" +
            "  \n" +
            "You know, she doesn't need a green card.\n" +
            "\n" +
            "  \n" +
            "I don't know what to say.\n" +
            "\n" +
            "  \n" +
            "I have something I want to say to you.\n" +
            "\n" +
            "  \n" +
            "Happy birthday, Amy.\n" +
            "\n" +
            "  \n" +
            "I heard you applied to be a state trooper.\n" +
            "\n" +
            "  \n" +
            "You say the word,\n" +
            "my department would be proud to have you.\n" +
            "\n" +
            "  \n" +
            "Thank you, sir. But I think\n" +
            "I'm gonna stick with what I do best.\n" +
            "\n" +
            "  \n" +
            "It's protecting the people\n" +
            "of the West Orange Pavilion Mall.";

    public static boolean isTrue(boolean b) {
        Arrays.stream(Boolean.toString(b).split("")).distinct().forEach((item) -> i++);
        if (i == 4 &&
                Arrays.stream(Boolean.toString(b).split("")).distinct().collect(Collectors.joining("")).length() == 4) {
            i = 0;
            return new Object() instanceof Object && BEE_MOVIE_SCRIPT.contains("true") &&
                    Arrays.stream(MALL_COP_SCRIPT.toLowerCase().split(" ")).distinct().anyMatch((str) -> str.equals("blart"));
        } else {
            i = 0;
            return !isTrue(new Object() instanceof Object) && BEE_MOVIE_SCRIPT.contains("false");
        }
    }
}

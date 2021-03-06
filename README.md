#Anagram:

The first question asked to create a function that would determine if two input strings are anagrams of each other. Some of the factors to consider were speed and memory efficiency. My first approach was rather simple. Since the character’s case had to be irrelevant, I made everything lowercase. Another thing to look out for was special characters and numbers, so I wrote regex that would remove all of those characters from the string. Once I had a clean string, I split it into a character array and sorted it. Finally, I checked if the arrays were equal. If they are true anagrams, their sorted arrays will be identical. 

I wrote some Junit tests to verify that this approach worked. It ended up working well, and I began working on the second question. While working on the second question, I thought of a different way of doing the first question, so I went ahead and implemented it. I was curious to see which approach would yield more performance efficiency. 

My second approach was also very simple. This approach took advantage that characters have a decimal value assigned to them. Since all I had to consider were the letters in the English alphabet, I knew which decimal values I was looking for. The characters a-z are represented by the decimal range 97-122, and the characters A-Z are represented by the decimal range 65-90. Since I know that the English alphabet has 26 letters in it, I made an array that represented each of those letters and filled it with 0’s. lettersArray[26] represents the English alphabet in my program, where the letter ‘a’ is index 0, ‘b’ is index 1, so on and so forth. When a character comes in, its decimal value is checked to see if it is within the ranges I’m looking for. If it is within either range, I increment the value for which that character represents in the lettersArray[]. For example, let’s say we get the character ‘J’. ‘J’ has a decimal value of 74. In order to find which index ‘J’ will correspond with in the lettersArray[] we subtract 65, 97 is subtracted in the case of a lowercase letter, from 74 which yields 9. This intuitively makes sense because ‘J’ is the 10th character in the alphabet, we begin counting at 0 so that’s why index 9 is the 10th value. With that 9, we grab the value in the lettersArray[], which was initialized to 0, and we increment it by one. In the end, we will have two lettersArray[], one for each string. These two arrays can then be compared to each other. If they are equal, that means that the two strings are anagrams.

Finally, I ran the same tests for the second function. The results were quite surprising.
First method:
![test1](/anagram1.PNG)
Second method:
![test2](/anagram2.PNG) 

Per the above screenshots, the second method took 33% of the time that the first method did! I believe the first method is slower because the string is traversed three times (regex, lowercase, sort), giving it a O(3n) for each string. As opposed to the second approach which has an O(n), since each string is only traversed once.

#Circle Center:
The second question asked to find the center of a circle given a 2d array, bitmap, that held one solid circle, which would be represented by 1’s. The solution I implemented works off of the principle of the midpoint formula and the properties of circles. Every circle has three things; a circumference, diameter, and radius. A diameter is a line segment that passes through the center of a circle and whose endpoints lie on the circle. It is also the longest straight line segment in a circle. The midpoint formula states that the middle point, M, of a line segment is found by: 
M=((x_1+ x_2)/2, (y_1+ y_2)/2)
Where the points (x_1 ,y_1) and (x_2,y_2) are the beginning and end of the line, respectively. 
Now that we have the math out of the way, let me explain what I’m getting at. My program traverses the 2d array row by row to find the row with the most amount of 1’s. Once I find that row, I essentially have the diameter of the circle. With the diameter, I can extract the beginning and end points of the line. Once I have that data, I can plug it into the midpoint formula to get the center of the circle.
I have included tests with circles of various sizes to verify that my program works. 

# Exceptions - String to Integer #

## Objective ##

Today, we're getting started with Exceptions by learning how to parse an integer from a 
string and print a custom error message. Check out the Tutorial tab for learning 
materials and an instructional video!

## Task ##

Read a string, _S_, and print its integer value; if _S_ cannot be converted to an 
integer, print `Bad String`.

**Note**: You must use the String-to-Integer and exception handling constructs built into 
your submission language. If you attempt to use loops/conditional statements, you will 
get a `0` score.

## Input Format ##

A single string, _S_.

## Constraints ##

 * 1 <= | _S_ | <= 6, where | _S_ | is the length of string _S_.
 * _S_ is composed of either lowercase letters (_a - z_) or decimal digits (_0 - 9_).

## Output Format ##

Print the parsed integer value of _S_, or Bad String if _S_ cannot be converted to an 
integer.

## Sample Input 0 ##

> 3

## Sample Output 0 ##

> 3

## Sample Input 1 ##

> za

## Sample Output 1 ##

> Bad String

## Explanation ##

Sample Case 0 contains an integer, so it should not raise an exception when we attempt to 
convert it to an integer. Thus, we print the 3 

Sample Case 1 does not contain any integers, so an attempt ot convert it to an integer 
will raise an exception. Thus, our exception handler prints Bad String.

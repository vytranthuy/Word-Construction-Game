# ToDo Package

## Overview
The ToDo package contains a `ToDo` class that offers various utility methods for manipulating strings and characters. This package is designed to assist in creating a word-construction game, where the focus is on implementing the game logic while utilizing provided visuals. The class includes methods for checking character types, counting vowels, validating words, and assessing string properties.

## Domain
This assignment is centered around a word-construction game. Your task is to complete the logic behind the game while the visuals have been pre-designed. Test cases are provided to facilitate debugging and ensure the accuracy of your code. You will work with Strings, and you can refer to the lecture notes provided in the COMP1000 section for additional context.

## Features
- **Character Checks**: Determine if a character is an English letter, a vowel, or a consonant.
- **Vowel Counting**: Count the number of vowels in a given string.
- **Word Validation**: Verify if a word exists in a predefined array and meets minimum length requirements.
- **Palindrome Check**: Assess if a string reads the same forwards and backwards.
- **Duplicate Letter Detection**: Identify if a string contains any letter more than once.
- **Sorting Checks**: Check if a string is sorted in ascending or descending order.
- **String Matching**: Match a target string against an array of words with support for wildcard characters.

## Usage
To utilize the methods within the `ToDo` class, invoke them with the appropriate parameters. Below are examples demonstrating how to call the methods:

```java
// Check if a character is an English letter
boolean isLetter = ToDo.isEnglishLetter('A');

// Count the number of vowels in a string
int vowelCount = ToDo.countVowels("Hello World");

// Check if a word is valid
boolean valid = ToDo.isValid("example", 3);

// Check if a string is a palindrome
boolean isPalin = ToDo.isPalindrome("racecar");

// Check if a string contains duplicate letters
boolean hasDuplicates = ToDo.containsDuplicateLetter("hello");

// Check if a string is sorted in ascending order
boolean isAscending = ToDo.isAscending("abcde");

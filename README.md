[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/oTWjtq_Z)
# Programming Patterns - Lab 12

This template repository is the starter project for Programming Patterns Lab 12. Written in Java, and tested with Gradle/JUnit.

### Question(s)

You are given n points in the plane that are all **distinct**, where points[i] = [xi, yi]. A **boomerang** is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (**the order of the tuple matters**).

Return the number of boomerangs.

Example 1:

Input: points = [[0,0],[1,0],[2,0]]  
Output: 2  
Explanation: The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]].

Example 2:

Input: points = [[1,1],[2,2],[3,3]]  
Output: 2

Example 3:

Input: points = [[1,1]]  
Output: 0

**Constraints**

n == points.length  
1 <= n <= 500  
points[i].length == 2  
-104 <= xi, yi <= 104  
All the points are **unique**.

### Setup Command

`gradle clean`

### Run Command

`gradle test`

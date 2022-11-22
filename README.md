# CS330-Final-Project
## Project Details
The purpose of this assignment was to implement Finite Automata concepts in solving real-life problems. Assigned to me in my Distrete Structures class by Professor Bistriceanu, students were tasked with developing a sort of security installation very similar to those installed in many offices and homes. The installation has a key pad, labeled from 0-9, determining whether or not a specific user has entered the correct access code. The security engine will unlock the lock when it finds the correct un-locking access code in the input string. Likewise, the security engine will lock the lock when it finds the correct locking access code in the input string. The program reads from standard input without echoing the input characters whilst other character aside from 0-9 are discarded quietly. The access code that will be recognized is the least significant five digits from my student ID (95238), followed by a 1 for the unlock code and by a 4 for the locking code. As soon as the last digit of the access code is enterd, the program will signal the action taken being either being lock or unlock.

## Build and Run the Executable
The language I used to build the executable was Java as it is what I am most proficient in. The code is very simplistic as I first created a constructor to instantiate the lock and unlock codes. I then created the main method. In the main method I established the boolean variable a and an integer variable c. After I made an instance of the random class and the previously made SecurityDevice constructor. Finally I made a do while loop that included within it a try catch statement allowing the stopage of a never ending loop, 2 if statments comparing the random numbers being generated to the lock and unlock codes, and I incremented the variable c to tell the user how many seconds it would take to crack the pin using randomly generated numbers. To run the following code use a Java compatible IDE.

## Test Environments
1. A fresh installation of Ubuntu 22.04 LTS (Jammy Jellyfish)
2. A fresh installation of Windows 11

## Contact 
Ethan Henry - Twitter: @Ethan_Henry3 - Email: ehenry2@hawk.iit.edu



`sdfsdf`

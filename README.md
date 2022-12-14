# CS330-Final-Project
## Project Details
The purpose of this assignment was to implement Finite Automata concepts in solving real-life problems. Assigned to me in my Distrete Structures class by Professor Bistriceanu, students were tasked with developing a sort of security installation very similar to those installed in many offices and homes. The installation has a key pad, labeled from 0-9, determining whether or not a specific user has entered the correct access code. The security engine will unlock the lock when it finds the correct un-locking access code in the input string. Likewise, the security engine will lock the lock when it finds the correct locking access code in the input string. The program reads from standard input without echoing the input characters whilst other character aside from 0-9 are discarded quietly. The access code that will be recognized is the least significant five digits from my student ID (95238), followed by a 1 for the unlock code and by a 4 for the locking code. As soon as the last digit of the access code is enterd, the program will signal the action taken being either being lock or unlock.

## Build and Run the Executable
The language I used to build the executable was Python as it is what I am most proficient in. The code is very simplistic and easy to Build and Run. You mentioned in class the Python code did not need a Build explanation; however, I will do my best to explain it. This was how I tested it on MacOS, as I don't have Windows or Linux avaliable to me. 
1. Navigate to the directory
2. Type `cd` plus the name of the directory where the file is located
3. Type `python3 CS330Project.py` or `UserInputCode.py`(Python3 may change depending on the python version you have)
4. Done

## Generate Unit Test Coverage
I am unsure if I did this correctly, but when I generated the unit test coverage I recieved a percentage of 76% which is supposedly optimal according to the internet. The code coverage tool I used was coverage.py

## Tested on 
MacOS

## Test Environments
1. A fresh installation of Ubuntu 22.04 LTS (Jammy Jellyfish)
2. A fresh installation of Windows 11

## Contact 
Ethan Henry - Twitter: @Ethan_Henry3 - Email: ehenry2@hawk.iit.edu




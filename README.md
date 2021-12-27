# CS121 - Module 5 - Methods, ArrayLists, File Parsing and Exceptions Guided Experimentation
The purpose of this guided experimentation is to provide students with an opportunity to experiment with the code examples presented in the lecture. It is important to keep detailed observation notes as you work through the experiments below. These observations will be useful to you as you complete the labs and you will be allowed to reference them on open book / open note quizzes. You will not be required to turn in your observations.
## Getting Started
To get started on this activity, please clone this repository into your development environment  

Steps to Clone Examples
1. Copy the URL for this repo by clicking the green "Code" button above, select HTTPS then click the copy icon.
2. Open VSCode, click the Source Control icon then click Clone Repository.
3. Pasted the repo URL into the "Provide repository URL" field and press Enter
4. Browse to the location in your development environment where you want to store the repostory and click Select Repository Location.
5. When prompted, Open the repository then Open the workspace

## Static Method Experimentation
1. Open *StaticFun.java* and *Utility.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Add the following two static methods to Utility.java.  Study both methods carefully to understand what they are doing.
    ```
    public static void numDoubler1(int x) {
        x = x * 2;
    }

    public static int numDoubler2(int x) {
        x = x * 2;
        return x;
    }
    ```
 
    - Add the following code to the end of the main method in StaticFun.java. What effect do the calls to numDoubler1() and numDoubler2() have on the value of myNum?, why?  
    ```
    int myNum = 2;

    Utility.numDoubler1(myNum);
    System.out.println("Value of myNum after calling numDoubler1: " + myNum);

    myNum = Utility.numDoubler2(myNum);
    System.out.println("Value of myNum after calling numDoubler2: " + myNum);
    ```
    
1. Open *StaticFun.java* and *Utility.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Add the following static method to Utility.java.  To build successfully, don't forget to import the **java.awt.point** class. Study the method carefully to understand what it is doing.
    ```
    public static void pointDoubler(Point p) {
        p.x = p.x * 2;
        p.y = p.y * 2;
    }
    ```
 
    - Add the following code to the end of the main method in StaticFun.java. Were the values of x and y inside the Point object modified by the pointDoubler() method even though it doesn't have a return value? What is the difference between passing in an object as a argument to a method vs passing in a primitive data type such as an int?  
    ```
    Point myPoint = new Point(2,3);

    System.out.println("Value of point before doubling: " + myPoint);
    Utility.pointDoubler(myPoint);
    System.out.println("Value of point after doubling: " + myPoint);
    ```
      
## ArrayList Experimentation
1. Open *MyRainbow.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Add three additional color objects to the rainbow immediately after ORANGE, YELLOW and PINK are added. Run the program and record how how affect the result of the list size as well as where in the list your colors were added.  To make this easier to record, you may temporarily *comment out* the code in the *working with loops* section.
    ```
    rainbow.add(Color.GREEN);
    rainbow.add(Color.BLUE);
    rainbow.add(Color.BLACK);
    ```
    - Notice in the constructor for the Arraylist, we *tagged* our rainbow ArrayList with the **Color** class. Let's see what happens when we an object that is not of type Color. Use the code below to add a String to our rainbow and make of note of the line number where you add the String. To make this easier to record, you may temporarily *comment out* the code in the *working with loops* section. Attempt to run the program and student the java output (stack trace) carefully.  Notice that it not only tells you exactly what is wrong, but also the line where the issue is detected.  Record your observations.
    ```
    rainbow.add("Purple");
    ```

    - Revert the code changes made in the previous steps.  Click the *Source Control* icon then select *MyRainbow.java* from the list of changes. Hover over the icons beside the filenames to find the icon labelled **Discard Changes**, then click it. This will revert all the code changes to MyRainbow.java back to the last commit.  Please be careful if you choose to use this functionality when working in your lab activities.


    - Modify the *rainbow.remove(0)* line as follows to intentionally remove a item that does not exist in the ArrayList, and make a note of the line number. Study the Java output (stacktrace) carefully noting the type of exception, the index value that cause the exception and the line number in MyRainbow where the exception was detected. Record your observations.
    ```
    rainbow.remove(199);
    ```

## File Parsing Experimentation
1. Open *MinOfThree.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Run the program with each of the following sets of input values and record the results of each. 
        - 1 2 3
        - 3 2 1
        - 1 1 3
        - 3 1 1
        - 3 3 3
            
    - Modify the code for technique 2, replacing each instance of '<=' with '<' as shown below.  Then run again with each of the sets of values. What is the result and why?  
    ```
    if ((num1 < num2) && (num1 < num3)) {
        min = num1;
    }
    if ((num2 < num3) && (num2 < num1)) {
        min = num2;
    }
    if ((num3 < num2) && (num3 < num1)) {
        min = num3;
    }
    ```
            
1. Open *Guessing.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Play three games and record what the correct answer was for each game
    - Modify the Random object so that it is instantiated using a seed number as shown below. Then Play the game three more times, recording the answer each time. What is the result and why?  
    ```
    Random generator = new Random(123);
    ```
      
## Exception Experimentation
1. Open *GradeReport.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Run the program with each of the following grades as input values and record the results of each. 
        - 95
        - 83
        - 71
        - 64
        - 59
    - Modify the switch statement by removing all of the *break* statements. The run the program again with the above values. What is the result and why?

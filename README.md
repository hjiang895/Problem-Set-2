# Problem Set 2: Getting Started with Java
## Due Thursday, January 24, 11:59pm EST

---

This problem will allow you to get more comfortable writing, compiling, and running code in Java. This problem set will also introduce you to using Slack to ask questions. If you are new to Java, I am expecting you to write the code in Atom and to compile and run the code using the platformio-ide-terminal package. (If you have problems with platformio-ide-terminal, you can always just use cmd (Windows) or Terminal (Mac) outside of Atom.)

---

### Reminder: Cloning

You have three options to clone the repository so that you have a local copy on your computer:

1. Use the GitHub Desktop app to clone the repo, then move it to your course directory.

*OR*

2. Use a terminal to issue ``git clone``, then move the repo to your course directory.

*OR*

3. Follow the instructions in the last problem set for using the Packages -> Command Palette in Atom.

After this problem set, I'll assume you have figured out the best way to do this for your system.

### Part 1: Compiling and running a Java program

1. Open your repository in Atom.

2. Click on the `src`  folder in the tree structure on the left, then go to ``Packages -> platformio-ide-terminal -> New Terminal``. 

3. In the terminal, make sure you're in the `src` directory by typing `pwd`. If you're not, use the `cd` command (e.g., `cd src` or `cd ..` to navigate to the `src` directory. Then type the following by the blinking curson in the terminal to compile the code in `PartOne.java`. **NOTE** Everything up to and including the `$` is what the prompt looks like on my computer. It might look different on your computer, but it will probably end with `$`. You only need to type everything that comes after the `$` below.

```bash
[bash ps1]$ javac PartOne.java
```

This will create a new file, `PartOne.class`, which is the Java byte code that can be understood by the Java virtual machine. 

3. Now run your program by typing:

```bash
[bash ps1]$ java PartOne
```

4. This should print ``Hello, World!`` to the screen.


### Part 2 (2 points) 
Java programs can receive *command line arguments* (i.e., input provided on the command line when running the program) just as they can in Python. The body of any `main` function in Java can access the command line arguments in the array `args` that we have seen in the declaration `public static void main (String[] args)`. In the following command:

   ```java
   [bash ps1]$ java PartTwo Boston College
   ```

   `args.length` would be `2`, the string `"Boston"` would be in `args[0]` while the string `"College"` would be the value in `args[1]`. 

In the `PartTwo.java` file, rewrite function so that it accepts a name from the command line. Running it as in

   ```java
   [bash ps1]$ java PartTwo Mookie
   ```

   should print

   ```java
   Hello, Mookie!
   ```

Make sure you did it right by compiling and running your code, as described in Part 1.

### Part 3 (2 points)
Java's `System` package has utilities for reading in input and printing out output (I/O). You have seen `System.out.println` which prints to standard out (i.e., the screen) whatever you give it as an argument. There's also a handy function named `format` in `System.out` which supports formatted output and does not include a new line at the end by default.  For example, the call

   ```java
   System.out.format("The city of %s is amazing!", "Boston");
   ```

   would print to the console

   ```java
   The city of Boston is amazing!
   ```

   The string `"The city of %s is amazing!"` is a *format string* and `%s` represents a placeholder in the string accepting a String as input. Other specifiers are `%d`, `%f` and `%c` for integers, floats, and characters, respectively. If you need a new line, you'd use `%n`. For example, this code:

   ```java
   int x = 12;
   String y = "seltzer";
   double z = 3.14;
   System.out.format("My favorite drink is %s, my favorite number is %d, and my favorite truncation of pi is %.2f%n", y, x, z);
   ```

   would print out

   ```bash
 My favorite drink is seltzer, my favorite number is 12, and my favorite truncation of pi is 3.14
   ```

1. Make a new file called `PartThree.java`. Copy and paste the contents of `PartOne.java` into this new file. 

2. Find the line of code that uses `System.out.println`.

3. Rewrite this line of code to do 2 things: (1) Use `System.out.format` instead of `System.out.println`. (2) Using `args[0]`, make this line print out a hello to the first command line argument. If the first command line argument is `Awkwafina`, then your program shoud print out `Hello, Awkwafina!`. 

4. Make sure you did it right by compiling and running your code, as described in Part 1.


### Part 3 (2 points) 
Java is notorious for its complicated I/O (input/output) architecture. The `algs4.jar` library you installed in ps0.5 provides a simpler interface for I/O. In this problem you'll use the `readString` function from `StdIn` from that library. You will use the `StdIn.readString` function to interactively prompt the user for a name, rather than having the user supply the name on the command line. Write this code in PartThree.java, then compile and run to make sure it works. Running that program should go as follows:

   ```java
   $ java Part3
   Type a name: Offred
   Hello, Offred !
   ```

I have provided the `import` of `algs4` that is necessary to access the `StdIn.readString` function, but I have left out some of the code I provided before. You will need to fill in the declaration of the `main` function, in addition to writing the code that does the printing. Copying and pasting from the previous programs is just fine, of course.


### Part 4 (4 points) 
`Part4.java` contains no code at all! Your job is to use the code from parts 1, 2, and 3, to write a program that takes an integer `n` as a command line argument and then uses `n` to determine how many times to print the string:

   ```java
   Come Mr. DJ won't you turn the music up?
   ```

   For example, the call

   ```java
   [bash ps1]$ java PartFour 4
   ```

   would print

   ```java
  Come Mr. DJ won't you turn the music up?
  Come Mr. DJ won't you turn the music up?
  Come Mr. DJ won't you turn the music up?
  Come Mr. DJ won't you turn the music up?
   ```

   For this problem you'll need to figure out how to do two things: (1) to convert a string representation of an integer such as `"343"` to an actual `int` `343`, and (2) to call the `System.out.println` function repeatedly. For the former, take a stroll through Java's built-in `Integer` class to see if there are any pre-defined library functions that might convert a string such as `"343"` to an integer `343`. For the latter, google Java for-loops, which are a bit different from `for` statements in Python. 

Once your code works to your satisfaction, save the files, stage them, commit them, and push them to your personal master repo on the class GitHub site. For a reminder about how to do this, see ps1.

As always, you can check to see if it worked by going to your account on GitHub and checking to see if it was updated and whether the files have changed in the way you expected.




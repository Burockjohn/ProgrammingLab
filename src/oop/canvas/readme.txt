## There will be many files used in this practice. All the files needed are already created. Look on the left side to see all files. Follow the given instructions to create each file.

### Create the `Quiz.java` file according to the following requirements.

  - declare these `instance variables`:
    - topic (String)
    - total number of questions (int)
    - total points (double)

  - create a `constructor` to initialize all the variables

  - create a void instance method: `takeQuiz()`
    - the method will print:
      > Taking the $topic quiz

  - create a `toString()` to print the Quiz objects in this format:
    > Quiz | $topic quiz with $questions questions for a total of $point total points
---
### Create the `File.java` file according to the following requirements.

  - declare these `instance variables`:
    - name (String)
    - size (double)

  - create a `constructor` to initialize all the variables

  - create a void instance method: `openFile()`
    - the method will print:
      > Opening $fileName

  - create a `toString()` to print the File objects in this format:
    > File{$fileName | $size mb}
---
### Create the `Module.java` file according to the following requirements.

  - declare these `instance variables`:
    - name (String)
    - files (ArrayList of File objects)

  - create these `constructors` to initialize the variables:
    - 1 argument (`String`): initialize the name and create an empty ArrayList of Files
    - 2 arguments (`String and ArrayList<File>`) initialize the name and use the given ArrayList as the starting Files

  - create a void instance method: `addFile()`
    - accept a File object and add the given File to the ArrayList of Files

  - create a void instance method: `removeFile()`
    - accept a File object and remove the given File to the ArrayList of Files

    Note: this could be tricky, try to use lambda and some logic to remove when the files name and size are the same to what you want to remove

  - create a `toString()` to print the Module objects in this format:
    > $module name
    >
    > Files:
    >
    > print ArrayList of files
---
### Create the `Canvas.java` file according to the following requirements.

  - declare these `instance variables`:
    - topic (String)
    - quizzes (ArrayList of Quiz objects)
    - modules (ArrayList of Module objects)

  - create these `constructors` to initialize the variables:
    - 1 argument (`String`): initialize the name and create an empty ArrayList of quizzes and modules
    - 3 arguments(`String, ArrayList<Quiz>, and ArrayList<Module>`):  initialize the name and use the given ArrayLists to set up the starting values of all quizzers and modules

  - create a `toString()` to print the Canvas objects in this format:
    > $topic name
    >
    > Quizzes:
    >
    > [ArrayList of Quiz]
    >
    > Modules:
    >
    > [ArrayList of Module]
---

#### Main topics: class & object, instance variables, constructors, constructor chaining, ArrayList
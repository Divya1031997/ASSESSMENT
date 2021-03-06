1. What is checked exception?
Ans: Checked Exceptions are those which is needed to be handled by the developer itself. Looking through the view of exceptions hierarchy,
we can say that exceptions except Runtime and its subclasses and Errors comes under Checked.

2. What is unchecked exception?
Ans: 

3. Who is responsible to handle checked and unchecked exception?
Ans: Checked Exceptions must be handled by Developer itself.
And handling Unchecked Exceptions by Developer are said to be optional and it is taken care of by JVM itself.

4. Which is the base class of all exception and error?
Ans: Throwable is the base class of all exceptions and errors.

5. Can we write only try block without catch and finally blocks?
Ans: No, We cannot have try block alone.
We can use either of the three ways:
i) we can write try with catch (multiple catch)
ii) we can write try with finally
iii) we can write try catch and finally in same sequence

6. Explain exception handling mechanism in java?

7. Differentiate between error and exception?

8. Examples of unchecked exception?
Ans: Unchecked exceptions are basically Runtime exceptions and its subclasses and Errors
ex: Arithematic Exceptions
Null pointer Exceptions
Out Of Bounds Exceptions

9. Examples of checked exception?
Ans: Checked Exceptions includes:
IO Exceptions --> FileNOTFOund Exceptions, EOFExceptions
SQLExceptions
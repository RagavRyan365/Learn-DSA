# Bit Manipuletion and Binary Basic

### What is Binary?
Binary is machine language that only contains two numbers 1s and 0s

>> Note the base rep the total digit in that number system eg decimal is 10 and binary is 2

### Decimal to Binary Convertion

    2/5 - 1 remainder (2 * 2 = 4)
    2/2 - 0 remainder
      1 - 1 take the last one as it is
      Binary of $5_{10}$ is $101_2$

### Binary to Decimal Convertion

         1     |     0     |     1     
     $2^2$ * 1   $2^1$ * 0   $2^0$ * 1
        4*1    +    2*0    +    1*1 ----> 4+0+1 = 5 - the Decimal

### Positive to Negative Decimal Number Convertion usig Binary
>>In this i Take 8-bit for example

Positive Decimal = 5 - 00000101

   Step 1 - Invert bits 0 to 1 1 to 0 --> 11111010
   Step 2 - Add 1 --> 11111010
                      00000001
                      --------
                      11111011 = -5

### How Computer find -ve and +ve
In binary the Binary has 0s in the front then it is +ve
eg: 0010 = 2
In binary the Binary has 1s in the front then it is -ve
eg: 1110 = -2

### Bitwise Oparetion
AND(&)

    AND oparetion on 0101(5) and 0011(3)
    0 1 0 1
    0 0 1 1  &
    -------
    0 0 0 1 = 1

    1 * 1 = 1
    0 * 1 = 0
    1 * 0 = 0

OR(|)

    OR oparetion on 0101(5) and 0011(3)
    0 1 0 1
    0 0 1 1  |
    -------
    1 0 0 0 = 8

    1 + 1 = 0 (2 in decimal but in binary it is 10) 0 here 1 carry
    0 + 1 + 1(carry) = 0
    1 + 0 + 1(carry) = 0
    0 + 0 + 1 = 1

NOT(~)

>>Note NOT is Inverting the bits 0 to 1 and 1 to 0

    NOT operation on 0101(5)
    0101 -> 1010(10)

XOR(^)

>>Note Xor logic is Different bit is 1 and Same bit is 0

    XOR oparetion on 0101(5) and 0011(3)
    0 1 0 1
    0 0 1 1  ^
    -------
    0 1 1 0 = 6

    1 1 = 0 Same bit
    0 1 = 1 Different bit
    1 1 = 1
    0 0 = 0

### Mathematicall operetion using Bitwise operators
Addition:

    java:
    //addition 2 + 3
    int x = 2,y =  3;
    while(y != 0){
      int carry  = (x & y) << 1;
      x = x ^ y;
      y = carry;
    }
    x -> has the result for 2 + 3

Subtraction;

    java:
    //subtraction 2 - 3;
    int x=2,y=3;
    while(y != 0){
      int borrow = (~x) & y;
      x = x ^ y;
      y = borrow << 1;
    }
    x -> has the result for 2 - 3

Multiplication:

    java:
    //Multiply 4 * 5
    int x=4,y=5;
    int ans =0; count =0;
    while(y > 0){
      if(y % 2 == 1){
        ans += x << count;
      }
      count++;
      y/=2;
    }
    ans -> has the result for 4 * 5
Division:

    java:
    //Divide 30/7
    int x = 30,y = 7;
    int sign  = (x> 0)^(y < 0) ? -1:1;
    x = Math.abs(x);
    y = Math.abs(y);
    int ans = 0;
    for(int i=31;i>=0;--i){
        if((y<<i) <= x){
            x -= (y<<i);
            ans |= (1L <<i);
        }
    }
    the final answer for 30/7 = 4 in the sign * ans
    

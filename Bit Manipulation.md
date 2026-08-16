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

### Bitwise Oparetion
AND(&)

    AND oparetion with 0101(5) and 0011(3)
    0 1 0 1
    0 0 1 1  &
    -------
    0 0 0 1 --- 1

    1 * 1 = 1
    0 * 1 = 0
    1 * 0 = 0

OR(|)

    OR oparetion with 0101(5) and 0011(3)
    0 1 0 1
    0 0 1 1  |
    -------
    1 0 0 0 --- 8

    1 + 1 = 0 (2 in decimal but in binary it is 10) 0 here 1 carry
    0 + 1 + 1(carry) = 0
    1 + 0 + 1(carry) = 0
    0 + 0 + 1 = 1

XOR(^)

>>Note Xor logic is Different bit is 1 and Same bit is 0

    XOR oparetion with 0101(5) and 0011(3)
    0 1 0 1
    0 0 1 1  ^
    -------
    0 1 1 0 --- 6

    1 1 Same bit = 0
    0 1 Differentbit = 1
    1 1 = 1
    0 0 = 0

void main() {
    System.out.println(power(2, 5));
}

int power(int base, int exponent) {

    int result = 1;
    for ( int i = 1; i <= exponent; i ++ ) {
        result *= base;
    }
    return result;
}
public class Bitwise {
    public static void main(String[] args) {
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011

        // Bitwise AND
        int bitwiseAnd = a & b; // 0101 & 0011 = 0001 (decimal 1)
        System.out.println("Bitwise AND: " + bitwiseAnd);

        // Bitwise OR
        int bitwiseOr = a | b; // 0101 | 0011 = 0111 (decimal 7)
        System.out.println("Bitwise OR: " + bitwiseOr);

        // Bitwise XOR
        int bitwiseXor = a ^ b; // 0101 ^ 0011 = 0110 (decimal 6)
        System.out.println("Bitwise XOR: " + bitwiseXor);

        // Bitwise NOT
        int bitwiseNotA = ~a; // ~0101 = 1010 (decimal -6 in 2's complement)
        System.out.println("Bitwise NOT of a: " + bitwiseNotA);

        int bitwiseNotB = ~b; // ~0011 = 1100 (decimal -4 in 2's complement)
        System.out.println("Bitwise NOT of b: " + bitwiseNotB);

        // Left shift
        int leftShiftA = a << 1; // 0101 << 1 = 1010 (decimal 10)
        System.out.println("Left shift of a: " + leftShiftA);

        // Right shift
        int rightShiftA = a >> 1; // 0101 >> 1 = 0010 (decimal 2)
        System.out.println("Right shift of a: " + rightShiftA);

        // Unsigned right shift
        int unsignedRightShiftA = a >>> 1; // 0101 >>> 1 = 0010 (decimal 2)
        System.out.println("Unsigned right shift of a: " + unsignedRightShiftA);
    }
}

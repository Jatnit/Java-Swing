/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi2;

import java.util.Scanner;

/**
 *
 * @author Latu4
 */
public class Bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m, n;
        System.out.print("Nhập số hàng (m <= 50): ");
        m = scanner.nextInt();
        System.out.print("Nhập số cột (n <= 100): ");
        n = scanner.nextInt();

        if (m <= 50 && n <= 100) {
            int[][] matrix = new int[m][n];

            while (true) {
                System.out.println("\nChọn chức năng:");
                System.out.println("1. Nhập giá trị cho mxn phần tử của mảng từ bàn phím");
                System.out.println("2. Phát sinh giá trị ngẫu nhiên từ -99 đến 99 cho mxn phần tử của mảng");
                System.out.println("3. Xuất giá trị các phần tử ra màn hình");
                System.out.println("4. Tính tổng giá trị các số lẻ");
                System.out.println("5. Tính tổng các giá trị dương trên dòng k cho trước");
                System.out.println("6. Đếm số lượng số dương");
                System.out.println("7. Đếm số lượng số nguyên tố trên một dòng của ma trận");
                System.out.println("8. Kiểm tra ma trận có tồn tại số âm hay không");
                System.out.println("9. Kiểm tra các phần tử trên dòng k cho trước có tăng dần từ trái qua phải hay không");
                System.out.println("10. Liệt kê dòng có chứa số nguyên tố");
                System.out.println("11. Liệt kê dòng chứa toàn giá trị chẵn");
                System.out.println("0. Thoát chương trình");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        inputMatrix(matrix, m, n);
                        break;
                    case 2:
                        randomMatrix(matrix, m, n);
                        break;
                    case 3:
                        printMatrix(matrix);
                        break;
                    case 4:
                        sumOfOddNumbers(matrix);
                        break;
                    case 5:
                        int k = scanner.nextInt();
                        sumOfPositiveNumbersInRow(matrix, k);
                        break;
                    case 6:
                        countPositiveNumbers(matrix);
                        break;
                    case 7:
                        countPrimeNumbersInRow(matrix);
                        break;
                    case 8:
                        checkNegativeNumbersExistence(matrix);
                        break;
                    case 9:
                        int rowToCheck = scanner.nextInt();
                        checkIncreasingOrder(matrix, rowToCheck);
                        break;
                    case 10:
                        listRowsWithPrimes(matrix);
                        break;
                    case 11:
                        listRowsWithEvenValues(matrix);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
                }
            }
        } else {
            System.out.println("Số hàng hoặc số cột vượt quá giới hạn.");
        }
    }

    private static void inputMatrix(int[][] matrix, int m, int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cho ma trận:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void randomMatrix(int[][] matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 199) - 99;
            }
        }
        System.out.println("Ma trận sau khi phát sinh giá trị ngẫu nhiên:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Ma trận:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    private static void sumOfOddNumbers(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value % 2 != 0) {
                    sum += value;
                }
            }
        }
        System.out.println("Tổng giá trị các số lẻ trong ma trận: " + sum);
    }

    private static void sumOfPositiveNumbersInRow(int[][] matrix, int k) {
        if (k >= 0 && k < matrix.length) {
            int sum = 0;
            for (int value : matrix[k]) {
                if (value > 0) {
                    sum += value;
                }
            }
            System.out.println("Tổng các giá trị dương trên dòng " + k + ": " + sum);
        } else {
            System.out.println("Dòng không hợp lệ.");
        }
    }

    private static void countPositiveNumbers(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > 0) {
                    count++;
                }
            }
        }
        System.out.println("Số lượng số dương trong ma trận: " + count);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void countPrimeNumbersInRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int value : matrix[i]) {
                if (isPrime(value)) {
                    count++;
                }
            }
            System.out.println("Dòng " + i + ": " + count + " số nguyên tố.");
        }
    }

    private static void checkNegativeNumbersExistence(int[][] matrix) {
        boolean hasNegative = false;
        outerLoop:
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < 0) {
                    hasNegative = true;
                    break outerLoop;
                }
            }
        }
        System.out.println(hasNegative ? "Ma trận có tồn tại số âm." : "Ma trận không có số âm.");
    }

    private static void checkIncreasingOrder(int[][] matrix, int rowToCheck) {
        if (rowToCheck >= 0 && rowToCheck < matrix.length) {
            boolean isIncreasingOrder = true;
            for (int i = 0; i < matrix[rowToCheck].length - 1; i++) {
                if (matrix[rowToCheck][i] > matrix[rowToCheck][i + 1]) {
                    isIncreasingOrder = false;
                    break;
                }
            }
            System.out.println(isIncreasingOrder ? "Dòng " + rowToCheck + " tăng dần từ trái qua phải."
                    : "Dòng " + rowToCheck + " không tăng dần từ trái qua phải.");
        } else {
            System.out.println("Dòng không hợp lệ.");
        }
    }

    private static void listRowsWithPrimes(int[][] matrix) {
        System.out.println("Các dòng chứa số nguyên tố:");
        for (int i = 0; i < matrix.length; i++) {
            for (int value : matrix[i]) {
                if (isPrime(value)) {
                    System.out.println("Dòng " + i);
                    break;
                }
            }
        }
    }

    private static void listRowsWithEvenValues(int[][] matrix) {
        System.out.println("Các dòng chứa toàn giá trị chẵn:");
        for (int i = 0; i < matrix.length; i++) {
            boolean isEvenRow = true;
            for (int value : matrix[i]) {
                if (value % 2 != 0) {
                    isEvenRow = false;
                    break;
                }
            }
            if (isEvenRow) {
                System.out.println("Dòng " + i);
            }
        }
    }
}

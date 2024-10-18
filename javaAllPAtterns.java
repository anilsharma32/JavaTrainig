import java.util.*;

//(1) QUES

// METHOD - 1
//Squar
// public class javaAllPAtterns {

//   static void printStar(int n,int r){

//     if(n>0){
//         star(r);
//         System.out.println();
//         printStar(n-1,r);
//     }
//     return;
// }
//     static void star(int n){
//         if(n>0){
//             System.out.print("* ");
//             star(n-1);
//         }
//         return;
//     }

//     public static void main(String[] args) {

//         printStar(4,4);

//     }

// }

// METHOD - 2
// public class javaAllPAtterns {
//     static void printStar(int starCount){
//         if(starCount==0){
//             return;
//         }
//         System.out.print("* ");
//         printStar(starCount-1);
//     }
//     static void printPattern(int row, int col){
//         if(row==0){
//             return;
//         }
//         printStar(col);
//         System.out.println();
//         printPattern(row-1,col);
//     }

//     public static void main(String[] args) {
//         printPattern(5,5);
//     }

// }

// (2) QUES
//Reverse of Right triangle
// public class javaAllPAtterns {

//     static void printStar(int n){

//       if(n>0){
//           star(n);
//           System.out.println();
//           printStar(n-1);
//       }
//       return;
//   }
//       static void star(int n){
//           if(n>0){
//               System.out.print("* ");
//               star(n-1);
//           }
//           return;
//       }

//       public static void main(String[] args) {

//           printStar(4);

//       }

//   }

//(3) QUES
// Right Triangle
// public class javaAllPAtterns {

//     static void printStar(int n){

//       if(n>0){
//           printStar(n-1);
//           System.out.println();
//           star(n);
//       }
//       return;
//   }
//       static void star(int n){
//           if(n>0){
//               System.out.print("* ");
//               star(n-1);
//           }
//           return;
//       }

//       public static void main(String[] args) {

//           printStar(4);

//       }

//   }



//(4) QUES
// Hollow Squar(CP)
// public class javaAllPAtterns {

//     private static final char squareChar = '*';
//     private static final char holeChar = ' ';

//     public static void main(String[] args) {
//         Scanner ma = new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int max = ma.nextInt();
//         repeatChar(squareChar, max);
//         System.out.println();
//         repeatMiddleLine(max - 2, max);
//         repeatChar(squareChar, max);
//         System.out.println();

//     }

//     static void repeatMiddleLine(int lineCount, int lineLength) {
//         if (lineCount > 0) {
//             System.out.print(squareChar);
//             repeatChar(holeChar, lineLength - 2);
//             System.out.println(squareChar);
//             repeatMiddleLine(lineCount - 1, lineLength);
//         }
//     }

//     static void repeatChar(char c, int count) {
//         if (count > 0) {
//             System.out.print(c);
//             repeatChar(c, count - 1);
//         }
//     }
// }


//(5) QUES
//Square from right(CP)
// public class javaAllPAtterns {

    
//     public static void printSpaces(int spaces) {
//         if (spaces == 0) {
//             return;
//         }
//         System.out.print(" ");
//         printSpaces(spaces - 1);
//     }

    
//     public static void printStars() {
//         System.out.print("****");
//     }

    
//     public static void printPattern(int totalRows, int currentRow) {
//         if (currentRow > totalRows) {
//             return;
//         }
//         printSpaces(currentRow - 1);
//         printStars();
//         System.out.println();

//         printPattern(totalRows, currentRow + 1);
//     }

//     public static void main(String[] args) {
//         int totalRows = 4; 
//         printPattern(totalRows, 1);
//     }
// }


//(6) squar from left
// public class javaAllPAtterns {
//     public static void printSpaces(int spaces) {
//         if (spaces == 0) {
//             return;
//         }
//         System.out.print(" ");
//         printSpaces(spaces - 1);
//     }

    
//     public static void printStars() {
//         System.out.print("****");
//     }

    
//     public static void printPattern(int totalRows, int currentRow) {
//         if (currentRow > totalRows) {
//             return;
//         }

        
//         printSpaces(totalRows - currentRow);
//         printStars();
//         System.out.println();

        
//         printPattern(totalRows, currentRow + 1);
//     }

//     public static void main(String[] args) {
//         int totalRows = 4; 
//         printPattern(totalRows, 1);
//     }
// }




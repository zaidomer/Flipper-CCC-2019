/**
 * Flipper
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String command = "";
    command = input.nextLine();
    int[][] numbers = {{1, 2}, {3, 4}};
    
    for(int i = 0; i < command.length(); i++) {
      if(command.charAt(i) == 'H') {
        numbers = horizontal(numbers);
      }else if(command.charAt(i) == 'V') {
        numbers = vertical(numbers);
      }
    }
    
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 2; j++) {
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  public static int[][] horizontal(int[][] numbers) {
    int[][] newNumbers = new int[2][2];
    int rowCount = 0;
    int columnCount = 0;
    for(int j = 0; j < 2; j++) {
      for(int i = 1; i >= 0; i--) {
        newNumbers[rowCount][j] = numbers[i][j];
        rowCount++;
      }
      rowCount = 0;
      columnCount++;
    }
    return newNumbers;
  }
  
  public static int[][] vertical(int[][] numbers) {
    int[][] newNumbers = new int[2][2];
    int rowCount = 0;
    int columnCount = 0;
    for(int j = 0; j < 2; j++) {
      for(int i = 1; i >= 0; i--) {
        newNumbers[j][columnCount] = numbers[j][i];
        columnCount++;
      }
      columnCount = 0;
    }
    return newNumbers;
  }
  
}

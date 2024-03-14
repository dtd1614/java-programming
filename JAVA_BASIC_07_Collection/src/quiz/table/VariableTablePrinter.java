package quiz.table;

public class VariableTablePrinter {

    // 가변적인 표를 생성하고 콘솔에 출력하는 메서드
    public static void printVariableTable(String[][] data) {
        // 표의 가로와 세로 크기
        int rows = data.length;
        int cols = data[0].length;

        // 각 열의 최대 길이를 저장할 배열
        int[] colWidths = new int[cols];

        // 각 열의 최대 길이 계산
        for (int col = 0; col < cols; col++) {
            int maxWidth = 0;
            for (int row = 0; row < rows; row++) {
                int elementWidth = getVisualWidth(data[row][col]);
                if (elementWidth > maxWidth) {
                    maxWidth = elementWidth;
                }
            }
            colWidths[col] = maxWidth;
        }

        // 표 출력
        for (int row = 0; row < rows; row++) {
            // 로우 구분선 출력
            printRowSeparator(colWidths);
            for (int col = 0; col < cols; col++) {
                String cell = data[row][col];
                int padding = colWidths[col] - getVisualWidth(cell);
                System.out.print("| " + cell);
                // 공백 채우기
                for (int i = 0; i < padding + 1; i++) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        // 마지막 로우 구분선 출력
        printRowSeparator(colWidths);
    }

    // 문자열의 시각적 너비 반환
    private static int getVisualWidth(String str) {
        int width = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                width++;
            } else {
                width += 2;
            }
        }
        return width;
    }

    // 로우 구분선 출력
    private static void printRowSeparator(int[] colWidths) {
//        System.out.print("+");
        for (int width : colWidths) {
            for (int i = 0; i < width + 4; i++) {
                System.out.print("-");
            }
//            System.out.print("+");
        }
        System.out.println();
    }

    // 테스트용 메인 메서드
    public static void main(String[] args) {
        String[][] data = {
            {"한글1", "한글22", "한글333", "English"},
            {"한글4444", "한글55555", "한글666666", "English111"},
            {"한글7777777", "한글88888888", "한글999999999", "English123456789"}
        };
        printVariableTable(data);
    }
}

public class Help {
    void helpOn(int what) {
        switch (what) {
            case '1' -> {
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println("else инструкция;");
            }
            case '2' -> {
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("    case константа:");
                System.out.println("        последовательность инструкций");
                System.out.println("        break;");
                System.out.println("    // ...");
                System.out.println("}");
            }
            case '3' -> {
                System.out.println("Цикл for:\n");
                System.out.print("for (init; условие; итерация)");
                System.out.println(" инструкция;");
            }
            case '4' -> {
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) инструкция;");
            }
            case '5' -> {
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println(" инструкция;");
                System.out.println("} while (условие);");
            }
            case '6' -> {
                System.out.println("Инструкция break:\n");
                System.out.println("break; или break метка;");
            }
            case '7' -> {
                System.out.println("Инструкция continue:\n");
                System.out.println("continue; или continue метка;");
            }
        }
    }

    void showMenu() {
        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Выберите (q - выход): ");
    }

    boolean isValid(int ch) {
        return (ch < '1' | ch > '7' & ch != 'q');
    }
}

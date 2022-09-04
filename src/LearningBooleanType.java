/**
 * <h1>Примитивные типы</h1>
 * <ul>
 *     <li>boolean</li>
 *     <li>char</li>
 *     <li>byte, short, int, long</li>
 *     <li>float, double</li>
 * </ul>
 * Имена примитивных типов - ключевые слова языка (так нельзя называть переменные) <br>
 * Переменные примитивного типа - это байты памяти. <br>
 * Если сделать <code>
 *     int a = 100;<br>
 *     int b = a;<br>
 * </code>
 * То создастся копия в памяти. Изменение копии не изменит исходную переменную. <br>
 * Все остальные типы являются ссылочными. <br><br>
 *
 * <h1>Примитивный тип boolean</h1>
 * <code>
 *     boolean a = true;<br>
 *     boolean b = false;<br>
 *     boolean c = a == b;<br>
 * </code>
 * Булевские переменные не конвертируются в другие примитивные типы, обратно также верно. <br>
 * Поддерживаемые операции: И - &&, ИЛИ - ||, НЕ - !, XOR - ^;<br>
 * Также поддерживаются операции такого типа:
 * <code>
 *     value &= expression;<br>
 *     // value = value & expression;<br>
 *     value |= expression; <br>
 *     // value = value | expression;<br>
 *     value ^= value ^ expression;<br>
 *     // value = value ^ expression;<br>
 * </code>
 */

public class LearningBooleanType {
    public static void main(String[] args) {
        boolean res = booleanExpression(true, false, true, false);
        System.out.println(res);
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a ^ b) & (c ^ d)) || ((a ^ c) & (b ^ d));
    }
}

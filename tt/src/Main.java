import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Unit NPC = new Unit("Anton");
       Unit NPC1 = new Unit("HAHA");
       NPC.printInfo();
       NPC1.printInfo();
       NPC1.shp();
       NPC.battle(NPC1);
       NPC1.php();
       NPC.shp();
       NPC.battle(NPC1);
       Mage mage = new Mage("MAGe", 23);
       Mage mage1 = new Mage("MaGE",3);
       mage.otherMage(mage1);
       mage1.changeMana(23);
       mage.otherMage(mage1);
    }
}
/*Ответы на вопросы:
1.
 Класс - шаблон для создания объекта
 Объект - экземпляр класса
 2. Инкапсуляция - он объединят код и класс, манипулирующий данными, и защищает от внешнего воздействия
 Наследование - описывание класса на основе другого класса
 Полиморфизм - реализация одинакого по смыслу действия различными способами
 3. Нет - ихг просто нет ☺, это модификатор по умолчанию
 public - публичный класс/функция/объект
 private - приватный класс/функция/объект
protected - мега public, доступен где только можно и нельзя 
 */
//Пакети використовуються для запобігання конфліктам імен та для зручної організації коду. Визначає, до якого пакету належить файл.Наприклад, пакет com.example буде відповідати директорії com/example
package org.example;
//об'єкт
public class Automobile {
// поля класу(атрибут). Також називають перемінні об'єкта
       public String model = "Kia";
       public String kolir;
       public int rik = 2017;
//конструктор
       public Automobile (String model, int rik) {
              this.model = model;
              this.rik = rik;
       }
// методи об'єкта, також поведінка об'єкта
       public String getModel() {
              return model;
       }
       public int getRik() {
              return rik;
       }
}

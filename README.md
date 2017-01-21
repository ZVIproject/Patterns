# Патерни

                                        
### Загальна інформація
***
**Singleton** — один об’єкт
        **instance holder** — об’єкт буде проініціалізовано при першому виклику метода getSnstance()  з синхронізацією на рівні загрузщика
        **double — checked locking** — для позбавлення зайвої синхронізації
        **lazy initialization** — недолік не позбавляється від синхронізації класу після створення екземпляру
***
**Factory Method** — передаємо процес створення об’єктів класу нащадкам  (ЩО саме створюється)

**Prototype** — клонування об’єкту.

**Builder** — від’єднуємо процес створення комплексного об’єкта від його представлення (ЯК створюється об’єкт)

**Abstract factory** — описуємо сутність для створення цілих сімейств взаємопов’язаних об’єктів

***
**SYNCHRONIZED** має два важливих моменти: це гарантія того, що тільки один потік виконує секцію коду в один момент часу 
        (взаємовиключення або mutex), і також гарантія того, що дані, змінені одним потоком, 
        будуть видні всім іншим потокам (видимість змін).
        
**VOLATILE** простіше, ніж синхронізація і підходить тільки для контролю доступу до одиночного примірнику
        або змінної примітивного типу: int, boolean ... Коли змінна оголошена як volatile, будь-який запис її 
        буде здійснюватися прямо в пам'ять, минаючи кеш. Також як і зчитуватися буде прямо з пам'яті, а не з всілякого кеша. 
        Це означає, що всі потоки будуть "бачити" одне і те ж значення змінної одночасно.
***
**Singleton**

    public final class Singleton{
        private static Singleton instance = null;
        
        private Singleton(){}
        
        public static synchronized Singleton getInstance(){
		if (_instanse==null){
			instance= new Singleton();
		}
		return instanse;		
	        }
        }

**lazy initialization**

        public final class Singleton{
	        private static Singleton instance = new Singleton();

	        private Singleton(){}

	        public static synchronized Singleton getInstance(){
		        return instance;		
	        }
        }


**double — checked locking**

        public final class Singleton{
	        private static Singleton instance = null;
	       
               private Singleton(){}
               
               public static synchronized Singleton getInstans(){
                  if (_instanse==null){
                        synchronized (Singelton.class){
                                if(_instance == null){
                                        instance= new Singleton();
                                }			
                        }
                  }
                  return _instanse;		
                }
        }

**instance holder**

	public enum Singleton{
	        INSTANCE;
        }
***
Додаткова інформація на сайті <http://www.javenue.info/post/design-patterns-java>


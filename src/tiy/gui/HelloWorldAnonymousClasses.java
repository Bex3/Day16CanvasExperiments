package tiy.gui;

/**
 * Created by bearden-tellez on 8/29/16.
 */
public class HelloWorldAnonymousClasses {

        interface HelloWorld { //local interface visible in this class
            public void greet();
            public void greetSomeone(String someone);
        }

        public void sayHello() {

            class EnglishGreeting implements HelloWorld { //implements the interface
                String name = "world";
                public void greet() {
                    greetSomeone("world");
                }
                public void greetSomeone(String someone) {
                    name = someone;
                    System.out.println("Hello " + name);
                }
            }

            HelloWorld englishGreeting = new EnglishGreeting();

            HelloWorld frenchGreeting = new HelloWorld() {//anon class - define in line can't be reused shorter way to do something that you just want to do once
                String name = "tout le monde";
                public void greet() {
                    greetSomeone("tout le monde");
                }
                public void greetSomeone(String someone) {
                    name = someone;
                    System.out.println("Salut " + name);
                }
            }; //the entire expression of a new instance of frenchGreeting ends here thus the need for ;

            HelloWorld spanishGreeting = new HelloWorld() {
                String name = "mundo";
                public void greet() {
                    greetSomeone("mundo");
                }
                public void greetSomeone(String someone) {
                    name = someone;
                    System.out.println("Hola, " + name);
                }
            };
            englishGreeting.greet();
            frenchGreeting.greetSomeone("Fred");
            spanishGreeting.greet();
        }

        public static void main(String... args) {
            HelloWorldAnonymousClasses myApp =
                    new HelloWorldAnonymousClasses();
            myApp.sayHello();
        }
    }



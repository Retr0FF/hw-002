//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = "+ dog);
        System.out.println("cat = "+ cat);
        System.out.println("paper = "+ paper);

        System.out.println();

        //Task 2
        var Dog = dog + 4;
        var Cat = cat + 4;
        var Paper = paper + 4;

        System.out.println("dog + 4 = "+ Dog);
        System.out.println("cat + 4 = "+ Cat);
        System.out.println("paper + 4 = "+ Paper);

        System.out.println();

        //Task 3
        var DogMinus = dog - 3.5;
        var CatMinus = cat - 1.6;
        var PaperMinus = paper - 7639;

        System.out.println("dog - 3.5 = "+ DogMinus);
        System.out.println("cat - 1.6 = "+ CatMinus);
        System.out.println("paper - 7639 = "+ PaperMinus);
        System.out.println();
        //Task 4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        System.out.println();
        //Task 5
        var frog = 3.5;
        System.out.println(frog);

        frog = frog *10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog +4;
        System.out.println(frog);

        System.out.println();

        //Task 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var totalWeight = boxer1 + boxer2;
        var weightDifference = boxer2 - boxer1;

        System.out.println("Общая масса двух бойцов: " + totalWeight +"кг");
        System.out.println("Разница между массами бойцов: " + weightDifference +"кг");

        System.out.println();

        // Task 7
        var remaider = boxer2 % boxer1;
        System.out.println("Остаток от деления между двумя весами: " + remaider);
    }
}
package desafio_hacker_rank_dia_4;

import java.util.Scanner;

    /**
     * 
     * @author Felipi Santana
     * @since 07/05/2021
     * 
     */

public final class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0){
          this.age = 0;
          System.out.println("Age is not valid, setting age to 0.");
      }else{
          this.age = initialAge;
      }
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int setAge){
        this.age = setAge;
    }

    public String amIOld() {
        String phrase = "";
        if (this.getAge() < 13){
            phrase = "You are young.";
        }else if (this.getAge() >= 13 && this.getAge() < 18){
            phrase = "You are a teenager.";
        }else {
            phrase = "You are old.";
        }
        System.out.println(phrase);
        return phrase;
	}

    public void yearPasses() {
        this.setAge(this.getAge()+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

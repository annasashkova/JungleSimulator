package ru.annasashkova.junglesimulator.util;

import ru.annasashkova.junglesimulator.entity.Capybara;

public class EventMaker {
    // капибара стоит и жует траву - индекс*энергия
    // капибара кушает плод в реке - энергия*индекс+10
    // капибара плавает в реке - -10 энергии
    // капибара ухаживает за потомством - -20 энергии +10жизни
    // капибара уверенно идет вперед - -10 энергии
    // капибара сражается с крокодилом - -40 энергии
    // капибира поспала - +50 энергии
    // капибара флиртует с другой капибарой - -10 энергии + 20 жизни
    // капибара скрывается от дикой собаки - -20 энергии
    // капибара была съедена Ягуаром - -100 жизни
    // энергия = 0 тогда жизни = -30

    public void activateEvent(){

    }

    private void eatGrass(Capybara capybara){
        int energy = capybara.getEnergy();
        energy = (int) (energy * capybara.foodPower);
        if(energy>100){
            energy = 100;
        }
        capybara.setEnergy(energy);
        System.out.println("Капибара стоит и вальяжно ест траву. Энергия пополнилась! Текущая энергия = " + capybara.getEnergy());
    }

    private void eatFruit(Capybara capybara){
        int energy = capybara.getEnergy();
        energy = (int) (energy * capybara.foodPower + 10);
        if(energy>100){
            energy = 100;
        }
        capybara.setEnergy(energy);
        System.out.println("Капибара нашла фрукт водного растения, пока стояла в воде! Ура, она съела фрукт и попила воды. Два в одном! Энергия пополнилась! Текущая энергия = " + capybara.getEnergy());
    }

    private void swim(Capybara capybara){
        int energy = capybara.getEnergy();
        energy = energy - 10;
        if( energy<0){
            energy = 0;
        }
        capybara.setEnergy(energy);
        System.out.println("Капибара поплавала! -10 энергии! Текущая энергия = " + capybara.getEnergy());
    }

    private void takeCareBabies(Capybara capybara){
        int energy = capybara.getEnergy();
        energy = energy - 20;
        if( energy<0){
            energy = 0;
        }
        capybara.setEnergy(energy);
        int health = capybara.getHealth();
        health = health + 10;
        if(health>100){
            health = 100;
        }
        capybara.setHealth(health);
        System.out.println("Капибара позаботилась о своей потомстве! Какая хорошая капибара! -20 энергии Текущая энергия = " + capybara.getEnergy());
        System.out.print("Любовь к семье придало смысла жизни! +10 к здоровью! Текущее здоровье = " + capybara.getHealth());
    }

    private void walk(Capybara capybara){
        int energy = capybara.getEnergy();
        energy = energy - 10;
        if( energy<0){
            energy = 0;
        }
        capybara.setEnergy(energy);
        System.out.println("Капибара уверенно идет вперед! Бери с нее пример! -10 энергии Текущая энергия = " + capybara.getEnergy());
    }

    private void fight(Capybara capybara){
        int energy = capybara.getEnergy();
        energy = energy - 40;
        if( energy<0){
            energy = 0;
        }
        capybara.setEnergy(energy);
        System.out.println("О, нет! На капибару напал крокодил! Прийдется устроить бой на выживание! -40 энергии Текущая энергия = " + capybara.getEnergy());
    }

    private void sleep(Capybara capybara){
        int energy = capybara.getEnergy();
        energy = energy + 50;
        if( energy>100){
            energy = 100;
        }
        capybara.setEnergy(energy);
        System.out.println("Капибара хорошо поспала! +50 энергии Текущая энергия = " + capybara.getEnergy());
    }

    private void flirt(Capybara capybara){
        int energy = capybara.getEnergy();
        energy = energy - 10;
        if( energy<0){
            energy = 0;
        }
        capybara.setEnergy(energy);
        int health = capybara.getHealth();
        health = health + 20;
        if(health>100){
            health = 100;
        }
        capybara.setHealth(health);
        System.out.println("Время пофлиртовать с другой капибарой! Нелегкое это дело быть такой популярной капибарой! -10 энергии Текущая энергия = " + capybara.getEnergy());
        System.out.print("Любовь к друг другу в стае! Вот что делает нас сильными! +20 здоровья Текущее здоровье = " + capybara.getHealth());
    }

    private void run(Capybara capybara){
        int energy = capybara.getEnergy();
        energy = energy - 20;
        if( energy<0){
            energy = 0;
        }
        capybara.setEnergy(energy);
        System.out.println("О, нет! За капибарой гонится дикая собака! Бежим! Бежим! Бежим! -20 энергии Текущая энергия = " + capybara.getEnergy());
    }

    private void death(Capybara capybara){
        int health = capybara.getHealth();
        health = health - 100;
        if(health<0){
            health = 0;
        }
        capybara.setHealth(health);
        System.out.print("К сожалению, капибару съел ягуар! Но такова жизнь... Капибара мертва!");
    }

}

package com.day5;

public class Game {
    Question[] questions = new Question[3];
    Player player= new Player();

    public void initGame(){

        for(int i=0;i<3;i++){
            questions[i]= new Question();
        }

        questions[0].question="Who is the Strongest Character in Money Heist ?";
        questions[0].option1="Professor";
        questions[0].option2="Tokyo";
        questions[0].option3="Rio";
        questions[0].option4="Nairobi";
        questions[0].correctAnswer=1;

        questions[1].question="How Many Players Can Play In One Football Team ?";
        questions[1].option1="8";
        questions[1].option2="11";
        questions[1].option3="10";
        questions[1].option4="8";
        questions[1].correctAnswer=2;

        questions[2].question="Which Is The Smallest Country In The World ?";
        questions[2].option1="Vatican City";
        questions[2].option2="San Marino";
        questions[2].option3="Tuvalu";
        questions[2].option4="Monaco";
        questions[2].correctAnswer=1;


    }

    public void play(){

        player.getDetails();
        for (int i=0;i<3;i++){
            boolean status = questions[i].askQuestion();
            if (status==true){
                System.out.println("Correct");
                player.score++;
            }
            else {
                System.out.println("Wrong");
            }
        }

        System.out.println(player.name + " your score is "+ player.score);

    }
}

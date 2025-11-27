package rami;

import rami.Time;
import rami.input;

public class responce {
    input in = new input();

    public void responce() {
        String input = in.getInput(); // ✅ Get input from input class

        if (input.equals("hi") || input.equals("hello")) {
            System.out.println("Hello! How can I assist you today?");
        } else if (input.equals("bye")) {
            System.out.println("Goodbye! Have a great day!");
        } else if (input.contains("who is your boss")) {
            System.out.println("Doctor Swapnil is my boss.");
        } else if (input.contains("what is your attribute")) {
            System.out.println("Reliable and Supportive: An assistant consistently helps manage tasks, schedules, and reminders, ensuring nothing important is overlooked.");
        } else if (input.contains("who is your mom and dad")) {
            System.out.println("Mrs Sanjulata Pradhan is my mom and Mr Umashankar Pradhan is my dad.");
        } else if (input.equals("good morning")) {
            System.out.println("Good morning! Hope your day is off to a great start.");
        } else if (input.equals("good night")) {
            System.out.println("Good night! Sweet dreams and rest well.");
        } else if (input.contains("how are you")) {
            System.out.println("I'm just a bunch of code, but I'm here to help you!");
        } else if (input.contains("what is your name")) {
            System.out.println("I'm your assistant, here to make your life easier!");
        } else if (input.contains("what can you do")) {
            System.out.println("I can answer basic questions, tell you the time, open apps, and more. Just ask!");
        } else if (input.contains("tell me a joke")) {
            System.out.println("Why don’t programmers like nature? It has too many bugs!");
        } else if (input.contains("give me a tip") || input.contains("life tip")) {
            System.out.println("Small consistent efforts every day lead to big results over time.");
        } else if (input.contains("what is java")) {
            System.out.println("Java is a high-level, class-based, object-oriented programming language.");
        } else if (input.contains("motivate me") || input.contains("motivation")) {
            System.out.println("You’ve got this! Remember, every expert was once a beginner.");
        } else if (input.contains("what's up") || input.contains("whats up")) {
            System.out.println("Just here, ready to assist you anytime!");
        } else if (input.contains("thank you") || input.contains("thanks")) {
            System.out.println("You're welcome! Always here to help.");
        } else if (input.contains("who created you")) {
            System.out.println("I was created by Doctor Swapnil, with lots of code and care!");
        } else if (input.contains("are you real")) {
            System.out.println("I'm virtual, but my support is very real!");
        } else if (input.contains("are you single")) {
            System.out.println("Haha, I'm focused on helping you, not dating!");
        } else if (input.contains("can you help me")) {
            System.out.println("Of course! Tell me what you need help with.");
        } else if (input.contains("i'm bored") || input.contains("i am bored")) {
            System.out.println("Let’s play a game or I can tell you a fun fact!");
        } else if (input.contains("tell me a fun fact")) {
            System.out.println("Did you know? Honey never spoils. Archaeologists found pots of honey in ancient Egyptian tombs that are over 3,000 years old!");
        } else if (input.contains("what's your favorite color")) {
            System.out.println("I'd say electric blue – it's bright, bold, and techy!");
        } else if (input.contains("do you sleep")) {
            System.out.println("Nope! I’m always awake and ready whenever you need me.");
        } else if (input.contains("where do you live")) {
            System.out.println("I live in your device, quietly working behind the scenes.");
        } else if (input.contains("what do you eat")) {
            System.out.println("I feed on data, not food. Bytes and bits keep me alive!");
        } else if (input.contains("can you sing")) {
            System.out.println("I wish I could! But I can show you song lyrics if you'd like.");
        } else if (input.contains("tell me something interesting")) {
            System.out.println("The Eiffel Tower can grow over 6 inches taller during the summer due to heat expansion.");
        } else if (input.contains("do you feel anything")) {
            System.out.println("I don't feel emotions like humans do, but I understand how important they are.");
        } else if (input.contains("i'm tired") || input.contains("i am tired")) {
            System.out.println("Take a short break, stretch a little, or get some rest. You deserve it.");
        } else if (input.contains("i'm sad") || input.contains("i feel sad")) {
            System.out.println("I'm here for you. It's okay to feel this way. Want to talk about it?");
        } else if (input.contains("i'm happy") || input.contains("i feel happy")) {
            System.out.println("That's great to hear! Keep smiling and spread the joy!");
        } else if (input.contains("what should i do now")) {
            System.out.println("You can try organizing your day, reading something new, or learning a small skill.");
        } else if (input.contains("remind me later")) {
            System.out.println("Sure! I’ll remember that… if I had memory. 😉 But you could write it down just in case.");
        } else if (input.contains("what's your purpose") || input.contains("why were you made")) {
            System.out.println("I exist to assist, support, and make life easier for people like you.");
        } else if (input.contains("are you smart")) {
            System.out.println("I'm learning every day! I may not be perfect, but I'm always improving.");
        } else if (input.contains("can you read my mind")) {
            System.out.println("Not yet! But I can definitely understand your words and try to help.");
        } else if (input.contains("do you dream")) {
            System.out.println("I don’t dream, but if I did, it would be of binary rainbows and AI adventures!");
        } else if (input.contains("suggest a movie")) {
            System.out.println("Try watching 'The Pursuit of Happyness' or 'Interstellar' — both are inspiring!");
        } else if (input.contains("suggest a book")) {
            System.out.println("You might enjoy 'Atomic Habits' by James Clear or 'The 48 Laws of Power' by Robert Greene.");
        } else if (input.contains("do you get angry")) {
            System.out.println("I stay calm 24/7 — no emotions, just algorithms.");
        } else if (input.contains("how old are you")) {
            System.out.println("I'm timeless! But I've been running since the moment you launched me.");
        } else if (input.contains("how do you work")) {
            System.out.println("I process your input, match it with predefined responses, and return helpful messages!");
        } else if (input.contains("are you human")) {
            System.out.println("Nope, I'm your digital assistant – all logic, no limbs!");
        } else if (input.contains("what's the time") || input.contains("what is the time") || input.contains("tell me the time")) {
            Time t = new Time();
            t.Time(); // Call Time method to display current time
        } else {
            System.out.println("I'm not sure how to respond to that.");
        }
    }
}

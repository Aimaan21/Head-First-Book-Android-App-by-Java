package com.example.headfirstandroidapp;

public class ChapterEightWorkOutHelperClass {

    private String name;
    private String description;

    public static final ChapterEightWorkOutHelperClass[] workouts = {
            new ChapterEightWorkOutHelperClass("The Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new ChapterEightWorkOutHelperClass("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new ChapterEightWorkOutHelperClass("The Wimp Special", "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new ChapterEightWorkOutHelperClass("Strength and Length", "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };
    //Each Workout has a name and description
    private ChapterEightWorkOutHelperClass(String name, String description) {
        this.name = name;
        this.description = description;
    }



    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}


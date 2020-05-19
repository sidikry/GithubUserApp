package com.timkontrakan.githubuserapp.data;

import com.timkontrakan.githubuserapp.R;
import com.timkontrakan.githubuserapp.model.User;

import java.util.ArrayList;

public class UserData {

    private static final String[] name = {
            "Jake Wharton",
            "Amit Shekhar",
            "Romain Guy",
            "Chris Banes",
            "David",
            "Ravi Tamada",
            "Deny Prasetyo",
            "Budi Oktovian",
            "Hendi Santika",
            "Sidik Permana"
    };

    private static final String[] username = {
            "@JakeWharton",
            "@amitshekhariitbhu",
            "@romainguy",
            "@chrisbanes",
            "@tipsy",
            "@ravi8x",
            "@jasoet",
            "@budioktaviyan",
            "@hendisantika",
            "@sidiqpermana"
    };

    private static final String[] address ={
            "Pittsburgh, PA, USA",
            "New Delhi, India",
            "California",
            "Sydney, Australia",
            "Trondheim, Norway",
            "India",
            "Kotagede, Yogyakarta, Indonesia",
            "Jakarta, Indonesia",
            "Bojongsoang - Bandung Jawa Barat",
            "Jakarta Indonesia"
    };

    private static final int[] avatar = {

            R.drawable.user_one,
            R.drawable.user_two,
            R.drawable.user_three,
            R.drawable.user_four,
            R.drawable.user_five,
            R.drawable.user_six,
            R.drawable.user_seven,
            R.drawable.user_eight,
            R.drawable.user_nine,
            R.drawable.user_ten
    };

    private static final String[] about = {
            "I’m a master coach, best-selling author and a passionate speaker. I’m the founder of the first man-only hedge fund, special counsellor in many corporations across the globe. I’ve found balance between work and life, now I’m a totally happy person, loving mother, ",
            "inspiring speaker and writer, and firm investor, but it didn’t come easily. I've gone though hundreds of failures and complicated situations. You can use my previous experience in order not to fall into the same trap.",
            "I was born in Kansas, and like little Ellie, I always dreamed that a hurricane would take me somewhere to another country. And once I really ended up in another country - in China, studying at a business school. There I began to travel a lot around Asia in my free time and then moved to work in Munich.",
            "People Call Me Sidik I am a CTO in the biggest company in the world, oh i really like my job, i have more and more experience in my lovely work so if you want succes you can follow me and don't forget like, comment, subscribe",
            "I discovered the world of low-cost airlines and began to fly somewhere and see the world every weekend. Being somewhere in the 15th country, I realized that I had enough experience and knowledge to share with others - and so this blog appeared. Here you will find useful tips, my travel experiences, life hacks and the usual daily thoughts about everything that surrounds me.",
            "I am a skilled artist helping you create really beautiful and meaningful things in your niche. My works are aesthetically pleasing in every shape and pattern.",
            "I am a Parasite the best movie in the world avengers can loose me cause i am the best picture in oscar, my movie is really emotional philopsopy and life, you must life for your like and don't be a parasite for the people",
            "I work with commercial projects of any scale and with private requests. I use the latest tools and creative approaches that help solve a specific business or personal issue.",
            "I'll be happy to join creative teams to work on young-eyed commercial or social projects. If you think we can create something great together, contact me in any convenient way to discuss the possible cooperation.",
            "My name is Doe Jameson and I am a skilled artist presenting unique projects. I work both with businesses and individuals, and always find a non-standard approach to the task.",
    };

    private static final String[] following = {
            "57",
            "37",
            "2",
            "21",
            "27",
            "25",
            "12",
            "21",
            "3",
            "4",

    };

    private static final String[] followers = {
            "527K",
            "374K",
            "256K",
            "2M",
            "7M",
            "290K",
            "122K",
            "211K",
            "390K",
            "444K",

    };

    public static ArrayList<User> getUserData() {
        ArrayList<User> users = new ArrayList<>();
        for (int i=0; i<username.length; i++){
            User user = new User();
            user.setUsername(username[i]);
            user.setName(name[i]);
            user.setAddress(address[i]);
            user.setAvatar(avatar[i]);
            user.setFollowing(following[i]);
            user.setAboutme(about[i]);
            user.setFollowers(followers[i]);

            users.add(user);
        }

        return users;
    }
}

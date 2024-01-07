package com.example.recyclerview_10avatars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    AvatarAdapter avatarAdapter;

    ArrayList<AvatarModel> avatarModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        avatarModelList= new ArrayList<>();

        AvatarModel avatarModel = new AvatarModel("matsya","Matsya is said to be the avatar that rescued the first man, as well as other creatures of the earth, from a great flood. Matsya is sometimes depicted as a great fish or as a human torso connected to the tail of a fish.",R.drawable.matsya);
        AvatarModel avatarModel1 = new AvatarModel("kurma","Kurma (or Koorma) is the tortoise incarnation that relates to the myth of churning the ocean to obtain treasures dissolved in the ocean of milk. In this myth, Vishnu took the form of a tortoise upon which to support the churning stick on his back.",R.drawable.kurma);
        AvatarModel avatarModel2 =new AvatarModel("varaha","Varaha is the boar that raised the earth from the bottom of the sea after the demon Hiranyaksha dragged it to the bottom of the sea. After a battle of 1,000 years, Varaha raised the earth out of the water with his tusks.",R.drawable.varaha);
        AvatarModel avatarModel3 =new AvatarModel("narasimha","As the legend goes, the demon Hiranyakashipiu obtained a boon from Brahma that he could not be killed or harmed by any means. Now arrogant in his security, Hiranyakshipiu began to cause trouble both in heaven and on earth. ",R.drawable.narasimha);
        AvatarModel avatarModel4 =new AvatarModel("vamana","In the Rig Veda, Vamana (the dwarf) appears when the demon king Bali ruled the universe and the gods lost their power. One day, Vamana visited the court of Bali and begged for as much land as he could cover in three steps. Laughing at the dwarf, Bali granted the wish.",R.drawable.vamana);
        AvatarModel avatarModel5 =new AvatarModel("parasurama","In his form as Parasurama, Vishnu appears as a priest (Brahman) who comes to the world to kill bad kings and protect humanity from danger. He appears in the form of a man carrying an ax, sometimes referred to as Rama with an ax. ",R.drawable.parasurama);
        AvatarModel avatarModel6 =new AvatarModel("rama","Lord Rama is the seventh avatar of Vishnu and a major deity of Hinduism. He is considered supreme in some traditions. He is the central figure of the ancient Hindu epic \"Ramayana\" and is known as King of Ayodhya, the city believed to be Rama's birthplace.",R.drawable.rama);
        AvatarModel avatarModel7 =new AvatarModel("Lord Krishna","Lord Krishna (the divine statesman) is the eighth avatar of Vishnu and is one of the most widely revered deities in Hinduism. He was a cowherd (sometimes depicted as a charioteer or statesman) who shrewdly changed rules.",R.drawable.lordkrishna);
        AvatarModel avatarModel8 =new AvatarModel("balarama","Balarama is said to be the elder brother of Krishna. It is believed that he engaged in many adventures alongside his brother. Balarama is rarely worshiped independently, but stories always focus on his prodigious strength.",R.drawable.balarama);
        AvatarModel avatarModel9 =new AvatarModel("kalki","Kalki (meaning “eternity” or \"mighty warrior\") is the last incarnation of Vishnu. He is not expected to appear until the end of Kali Yuga, the current time period. Kalki will come, it is believed, to rid the world of oppression by unrighteous rulers. It is said that he will appear riding a white horse and carrying a fiery sword.",R.drawable.kalki);

        avatarModelList.add(avatarModel);
        avatarModelList.add(avatarModel1);
        avatarModelList.add(avatarModel2);
        avatarModelList.add(avatarModel3);
        avatarModelList.add(avatarModel4);
        avatarModelList.add(avatarModel5);
        avatarModelList.add(avatarModel6);
        avatarModelList.add(avatarModel7);
        avatarModelList.add(avatarModel8);
        avatarModelList.add(avatarModel9);


        avatarAdapter=new AvatarAdapter(avatarModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(avatarAdapter);

    }
}
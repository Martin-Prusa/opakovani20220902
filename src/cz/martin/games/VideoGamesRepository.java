package cz.martin.games;

import java.util.Arrays;
import java.util.List;

public class VideoGamesRepository {
    private String input = "\"APB: All Points Bulletin\";\"2010\";\"Realtime Worlds\";\"PC\";\"Realtime Worlds\";\"$50,000,000\";\"\";\"$50,000,000\";\"http://en.wikipedia.org/wiki/APB:_All_Points_Bulletin\";\"https://upload.wikimedia.org/wikipedia/en/f/f1/All_Points_Bulletin.jpg\";\"APB: All Points Bulletin developed by Realtime Worlds and was acquired by Reloaded Productions, which is part of the GamersFirst company. Based in urban sprawls and featuring two factions, Enforcers and the Criminals, players can form sub-groups in either faction and carry out missions. The game design was led by David Jones, who created the original Grand Theft Auto and Crackdown, and was developed by Realtime Worlds. It was released on 6 June 2010 in North America, and Europe.\"\n" +
            "\"Call of Duty: Elite\";\"2011\";\"Beachhead Studios\";\"PC\";\"Activision\";\"$50,000,000\";\"\";\"$50,000,000\";\"http://en.wikipedia.org/wiki/Call_of_Duty:_Elite\";\"https://upload.wikimedia.org/wikipedia/en/b/b1/Call_of_Duty_ELITE_Logo.jpg\";\"Call of Duty: Elite was an online service created by the Activision subsidiary Beachhead Studios for the multiplayer portion for the first-person shootervideo game series Call of Duty. The service features lifetime statistics across multiple games as well as a multitude of social-networking options. The service previously had a premium subscription option during Call of Duty: Modern Warfare 3, however with the release of Call of Duty: Black Ops II, the service is now completely free. As of February 28, 2014 at approximately 10:00 a.m. (PST) Activision shut down the Call of Duty Elite website making it no longer accessible in favor of their mobile products.\"\n" +
            "\"Crysis 3\";\"2013\";\"Crytek Frankfurt\";\"PS3, Xbox 360, PC\";\"Electronic Arts\";\"$66,000,000\";\"\";\"$66,000,000\";\"http://en.wikipedia.org/wiki/Crysis_3\";\"https://upload.wikimedia.org/wikipedia/en/2/20/Crysis_3_cover.jpg\";\"Crysis 3 is a first-person shootervideo game developed by the German game developer Crytek and is published by Electronic Arts (EA) for Microsoft Windows, PlayStation 3, and Xbox 360. It was released in North America on February 19, 2013. Officially announced April 14, 2012, it is the third main installment of the Crysis series, a sequel to the 2011 video game Crysis 2, and runs on the CryEngine 3 game engine. Crysis 3 has won PC Gamer Most Valuable Game, Game Informer Best of Show and Electric Playground Best of E3 awards.\"\n" +
            "\"DC Universe Online\";\"2012\";\"Sony Online Entertainment\";\"PC, PS3, PS4\";\"\";\"$50,000,000\";\"\";\"$50,000,000\";\"http://en.wikipedia.org/wiki/DC_Universe_Online\";\"https://upload.wikimedia.org/wikipedia/en/c/c9/DC_Universe_Online_PS3.jpg\";\"DC Universe Online is a massively multiplayer online role-playing game (MMORPG) based upon the fictional universe of DC Comics. Developed by Sony Online Entertainments Austin studio and co-published by Sony Computer Entertainment and WB Games, the game was released in January 2011.\"\n" +
            "\"Deadpool\";\"2013\";\"High Moon Studios\";\"PS3, Xbox 360, PC\";\"Activision\";\"\";\"\";\"$100,000,000\";\"http://en.wikipedia.org/wiki/Deadpool_(video_game)\";\"https://upload.wikimedia.org/wikipedia/en/4/41/Deadpool_video_game_cover.png\";\"Deadpool is an actioncomedybeat 'em upvideo game based on the Marvel Comics character of the same name. The game was developed by High Moon Studios and published by Activision, and was released for Microsoft Windows, PlayStation 3 and Xbox 360. Former Deadpool comic writer Daniel Way created the game's plot, and Nolan North voiced the character. The game received mixed to positive reviews, with plot elements commonly praised and gameplay elements found lacking.\"\n" +
            "\"Defiance\";\"2013\";\"Trion Worlds\";\"PC, PS3, Xbox 360\";\"Trion Worlds\";\"$80,000,000\";\"\";\"$80,000,000\";\"http://en.wikipedia.org/wiki/Defiance_(video_game)\";\"https://upload.wikimedia.org/wikipedia/en/e/ee/Defiance_cover.png\";\"Defiance is a science fiction-themed persistent worldmassively multiplayer onlinethird-person shooter developed by Trion Worlds. Defiance takes place on a terraformed Earth several decades into the future. It is a tie-in to the Syfy show of the same name. The game was released on April 2, 2013, for Microsoft Windows, PlayStation 3 and Xbox 360. It was also released on Steam. The game went free-to-play on 4 June 2014 for PC and is scheduled to do the same 15 July 2014 for PS3 and Xbox 360.\"\n" +
            "\"Destiny\";\"2014\";\"Bungie\";\"PS3, PS4, Xbox 360, Xbox One\";\"Activision\";\"\";\"\";\"$500,000,000\";\"http://en.wikipedia.org/wiki/Destiny_(video_game)\";\"https://upload.wikimedia.org/wikipedia/en/b/be/Destiny_box_art.png\";\"Destiny is an onlinepersistent worldfirst-person shootervideo game in a \"\"mythic science fiction\"\"open world setting. It was developed by Bungie and published by Activision as part of a ten-year publishing deal. The game was released on PlayStation 3, PlayStation 4,Xbox 360, and Xbox Onevideo game consoles on September 9, 2014.\"\n" +
            "\"Disney Infinity\";\"2013\";\"Avalanche Software\";\"PS3, Xbox 360, Wii U, 3DS, PC\";\"Disney Interactive Studios\";\"\";\"\";\"$100,000,000\";\"http://en.wikipedia.org/wiki/Disney_Infinity\";\"https://upload.wikimedia.org/wikipedia/en/1/15/Packaging_en_US.png\";\"Disney Infinity is an action-adventuresandboxvideo game developed by Avalanche Software and published by Disney Interactive Studios. It was announced in 2010 and developed for approximately $100 million. Similar to Activisions Skylanders franchise, the game uses collectible figurines that are then synchronized with the game, allowing for characters from Disney and Pixar properties to interact and go on adventures. The game was released for Xbox 360, PlayStation 3, Wii, Wii U, and Nintendo 3DS in August 2013. A PC version of Toy Box was also released on November 14, 2013. The second edition, Disney Infinity: Marvel Super Heroes, has been announced for September 23, 2014.\"\n" +
            "\"Final Fantasy VII\";\"1997\";\"Square\";\"PS, PC\";\"Square\";\"$45,000,000\";\"$100,000,000\";\"$145,000,000\";\"http://en.wikipedia.org/wiki/Final_Fantasy_VII\";\"https://upload.wikimedia.org/wikipedia/en/c/c2/Final_Fantasy_VII_Box_Art.jpg\";\"Final Fantasy VII(ファイナルファンタジーVII,Fainaru Fantajī Sebun?, i.e. Final Fantasy Seven, stylized as FINAL FANTASY VII) is a role-playing video game developed by Square (now Square Enix) as the seventh installment in the Final Fantasy series. It was released in 1997 for the SonyPlayStation, in 1998 for Microsoft Windows-based personal computers, in 2009 on the PlayStation Network, in 2012 on PC Digital Download, and in 2013 on Steam. The game is the first in the series to use 3D computer graphics, featuring fully rendered characters on pre-rendered backgrounds, and was the first game in the main series to be released in Europe.\"\n" +
            "\"Gran Turismo 5\";\"2010\";\"Polyphony Digital\";\"PS3\";\"Sony Computer Entertainment\";\"$60,000,000\";\"\";\"$60,000,000\";\"http://en.wikipedia.org/wiki/Gran_Turismo_5\";\"https://upload.wikimedia.org/wikipedia/en/8/8b/GT5-boxart-final-EU.jpg\";\"Gran Turismo 5(グランツーリスモ 5,Guran Tsūrisumo Faibu?, commonly abbreviated as GT5) is the fifth game in the Gran Turismosim racingvideo game series. Developed by Polyphony Digital and published by Sony Computer Entertainment, it was released for PlayStation 3 on November 24, 2010. It expands on the game's Prologue version and is the first entry of the series to be developed for PlayStation 3. As of 2013, it is currently one of the best-selling PS3 games and the best selling PS3 exclusive with over 10 million copies sold.\"\n" +
            "\"Grand Theft Auto IV\";\"2008\";\"Rockstar North\";\"PS3, Xbox 360, PC\";\"Rockstar Games\";\"$100,000,000\";\"\";\"$100,000,000\";\"http://en.wikipedia.org/wiki/Grand_Theft_Auto_IV\";\"https://upload.wikimedia.org/wikipedia/en/b/b7/Grand_Theft_Auto_IV_cover.jpg\";\"Grand Theft Auto IV is an open worldaction-adventurevideo game developed by Rockstar North and published by Rockstar Games. It was released on 29 April 2008 for the PlayStation 3 and Xbox 360 consoles, and on 2 December 2008 on Microsoft Windows. It is the eleventh title in the Grand Theft Auto series, and the first main entry since 2004's Grand Theft Auto: San Andreas. Set within the fictional Liberty City (based on New York City), the single-player story follows a war veteran and his attempts to escape his past while under pressure from loan sharks and mob bosses. The open world design lets players freely roam Liberty City, consisting of three main islands.\"\n" +
            "\"Grand Theft Auto V\";\"2013\";\"Rockstar North\";\"PC, PS3, PS4, Xbox 360, Xbox One\";\"Rockstar Games\";\"\";\"\";\"$494,000,000\";\"http://en.wikipedia.org/wiki/Grand_Theft_Auto_V\";\"https://upload.wikimedia.org/wikipedia/en/a/a5/Grand_Theft_Auto_V.png\";\"Grand Theft Auto V is an open world, action-adventure video game developed by Rockstar North and published by Rockstar Games. It was released on 17 September 2013 for the PlayStation 3 and Xbox 360, and is scheduled to be released on 18 November 2014 for the PlayStation 4 and Xbox One, and on 27 January 2015 for Microsoft Windows. The game is the first main entry in the Grand Theft Auto series since 2008's Grand Theft Auto IV. Set within the fictional state of San Andreas (based on Southern California), the single-player story follows three criminals and their efforts to commit heists while under pressure from a government agency. The open world design lets players freely roam San Andreas, which includes open countryside and the fictional city of Los Santos (based on Los Angeles).\"\n" +
            "\"Halo 3\";\"2007\";\"Bungie\";\"Xbox 360\";\"Microsoft Game Studios\";\"$60,000,000\";\"\";\"$60,000,000\";\"http://en.wikipedia.org/wiki/Halo_3\";\"https://upload.wikimedia.org/wikipedia/en/b/b4/Halo_3_final_boxshot.JPG\";\"Halo 3 is a 2007 first-person shooter video game developed by Bungie for the Xbox 360 console. The third installment in the Halo franchise, the game concludes the story arc begun in 2001's Halo: Combat Evolved and continued in 2004's Halo 2. The game was released on September 25, 2007, in Australia, Brazil, India, New Zealand, North America, and Singapore September 26, 2007, in Europe and September 27, 2007, in Japan. Halo 3s story centers on the interstellar war between twenty-sixth century humanity and a collection of alien races known as the Covenant. The player assumes the role of the Master Chief, a cybernetically enhanced supersoldier, as he battles the Covenant. The game features vehicles, weapons, and gameplay not present in previous titles of the series, as well as the addition of saved gameplay films, file sharing, and the Forge map editor—a utility which allows the player to perform modifications to multiplayer levels.\"\n" +
            "\"Halo MMO\";\"cancelled\";\"Ensemble Studios\";\"PC\";\"Microsoft Game Studios\";\"$90,000,000\";\"\";\"$90,000,000\";\"http://en.wikipedia.org/wiki/Halo_(series)#Cancelled_and_related_projects\";\"https://upload.wikimedia.org/wikipedia/commons/8/83/Halo-Logo.png\";\"Halo is a top-selling military science fictionfirst-person shootervideo game franchise developed by Bungie and now managed and developed by 343 Industries, a subsidiary of Microsoft Studios. The series centers on an interstellar war between humanity and a theocratic alliance of aliens known as the Covenant. The Covenant, led by their religious leaders called the Prophets, worship an ancient civilization known as the Forerunners, who perished in combat with the parasitic Flood. The central focus of the franchise builds off the experiences of Master Chief John-117, one of a group of supersoldiers codenamed Spartans, and his artificial intelligence (AI) companion, Cortana. Other characters, such as Noble Six from Halo Reach, are also introduced in the series. The term \"\"Halo\"\" refers to the Halo rings: large, habitable structures that were created by the Forerunners to destroy all sentient life. They are similar to the Orbitals in Iain M Banks Culture novels, and author Larry Nivens Ringworld concept.\"\n" +
            "\"Halo: Reach\";\"2010\";\"Bungie\";\"Xbox 360\";\"Microsoft Game Studios\";\"$55,000,000\";\"\";\"$55,000,000\";\"http://en.wikipedia.org/wiki/Halo:_Reach\";\"https://upload.wikimedia.org/wikipedia/en/5/5c/Halo-_Reach_box_art.png\";\"Halo: Reach is a 2010 first-person shootervideo game developed by Bungie and published by Microsoft Game Studios for the Xbox 360 console. Reach was released in North America, Australia, and Europe on September 14, 2010. The game takes place in the year 2552, where humanity is locked in a war with the alien Covenant. Players control Noble Six, a member of an elite supersoldier squad, when the human world known as Reach falls under Covenant attack.\"\n" +
            "\"Heavy Rain\";\"2010\";\"Quantic Dream\";\"PS3\";\"Sony Computer Entertainment\";\"$23,200,000\";\"$32,400,000\";\"$55,600,000\";\"http://en.wikipedia.org/wiki/Heavy_Rain\";\"https://upload.wikimedia.org/wikipedia/en/c/c1/Heavy_Rain_Cover_Art.jpg\";\"Heavy Rain is an interactive dramaaction-adventurevideo game developed by Quantic Dream and published by Sony Computer Entertainment exclusively for the PlayStation 3 in 2010.\"\n" +
            "\"Homefront\";\"2011\";\"Kaos Studios\";\"PC, Xbox 360, PS3, OnLive\";\"THQ\";\"$50,000,000\";\"\";\"$50,000,000\";\"http://en.wikipedia.org/wiki/Homefront_(video_game)\";\"https://upload.wikimedia.org/wikipedia/en/9/96/Homefront.jpg\";\"Homefront is a first-person shooter video game developed by Kaos Studios and published by THQ. The game tells the story of a resistance movement fighting against a near-future foreign military occupation of the western United States. It was released for Microsoft Windows, PlayStation 3 and Xbox 360 in 2011. After THQs bankruptcy, the rights of the game were sold to Crytek, who will be developing the game's sequel, Homefront: The Revolution.\"\n" +
            "\"L.A. Noire\";\"2011\";\"Team Bondi\";\"PS3, Xbox 360, PC\";\"Rockstar Games\";\"$50,000,000\";\"\";\"$50,000,000\";\"http://en.wikipedia.org/wiki/L.A._Noire\";\"https://upload.wikimedia.org/wikipedia/en/3/3c/LA-Noire-Box-Art.jpg\";\"L.A. Noire (pronounced [ˌɛl ˌɛɪ ˈnwaʁ]) is a neo-noirdetectivevideo game developed by Team Bondi and published by Rockstar Games. It was initially released for the PlayStation 3 and Xbox 360 platforms on 17 May 2011 a Microsoft Windows port was later released on 8 November 2011.L.A. Noire is set in Los Angeles in 1947 and challenges the player, controlling a Los Angeles Police Department (LAPD) officer, to solve a range of cases across five departments. Players must investigate crime scenes for clues, follow up leads, and interrogate suspects, and the players' success at these activities will impact how much of each cases' story is revealed.\"\n" +
            "\"Max Payne 3\";\"2012\";\"Rockstar Studios\";\"PC, Xbox 360, PS3, OS X\";\"Rockstar Games\";\"$105,000,000\";\"\";\"$105,000,000\";\"http://en.wikipedia.org/wiki/Max_Payne_3\";\"https://upload.wikimedia.org/wikipedia/en/2/21/Max_Payne_3_Cover.jpg\";\"Max Payne 3 is a third-person shootervideo game developed by Rockstar Studios and published by Rockstar Games. It was released on 15 May 2012 for the PlayStation 3 and Xbox 360 a Microsoft Windows port was released on 31 May 2012, followed by an OS X port on 20 June 2013. The game is the first entry in the Max Payne series since 2003's Max Payne 2: The Fall of Max Payne, developed by Remedy Entertainment.\"\n" +
            "\"Metal Gear Solid 4: Guns of the Patriots\";\"2008\";\"Kojima Productions\";\"PS3\";\"Konami\";\"$70,000,000\";\"\";\"$70,000,000\";\"http://en.wikipedia.org/wiki/Metal_Gear_Solid_4:_Guns_of_the_Patriots\";\"https://upload.wikimedia.org/wikipedia/en/4/4b/Mgs4us_cover_small.jpg\";\"Metal Gear Solid 4: Guns of the Patriots(Japanese: メタルギアソリッド4 ガンズ・オブ・ザ・パトリオット,Hepburn: Metaru Gia Soriddo Fō Ganzu Obu Za Patoriotto?, commonly abbreviated as MGS4) is an action-adventurestealthvideo game developed by Kojima Productions exclusively for the PlayStation 3 console. It was the sixth Metal Gear game directed by Hideo Kojima and is set nine years after the events of Metal Gear Solid and five years after the events of Metal Gear Solid 2: Sons of Liberty. Guns of the Patriots made its worldwide release on June 12, 2008.\"\n" +
            "\"Red Dead Redemption\";\"2010\";\"Rockstar San Diego\";\"PS3, Xbox 360\";\"Rockstar Games\";\"$90,000,000\";\"\";\"$100,000,000\";\"http://en.wikipedia.org/wiki/Red_Dead_Redemption\";\"https://upload.wikimedia.org/wikipedia/en/a/a7/Red_Dead_Redemption.jpg\";\"Red Dead Redemption is an open worldwesternaction-adventurevideo game developed by Rockstar San Diego and published by Rockstar Games. It was released for the PlayStation 3 and Xbox 360 consoles on May 18, 2010. It is the second title in the Red Dead franchise, and is a spiritual successor to 2004's Red Dead Revolver. The game, set during the decline of the American Frontier in the year 1911, follows John Marston, a former outlaw whose wife and son are taken hostage by the government in ransom for his services as a bounty hunter. Having no other choice, Marston sets out to bring the three members of his former gang to justice.\"\n" +
            "\"Rift\";\"2011\";\"Trion Worlds\";\"PC\";\"Trion Worlds\";\"$65,000,000\";\"\";\"$65,000,000\";\"http://en.wikipedia.org/wiki/Rift_(video_game)\";\"https://upload.wikimedia.org/wikipedia/en/4/4e/Rift_cover.jpg\";\"Rift (previously known as Rift: Planes of Telara) is a fantasyfree-to-play massively multiplayer online role-playing game (MMORPG) developed by Trion Worlds. Rift takes place within the fantasy world of Telara. The game was released in March 2011.\"\n" +
            "\"Shenmue\";\"1999\";\"Sega AM2\";\"Dreamcast\";\"Sega\";\"$47,000,000\";\"$23,000,000\";\"$70,000,000\";\"http://en.wikipedia.org/wiki/Shenmue\";\"https://upload.wikimedia.org/wikipedia/en/e/e2/ShenmueDCbox.jpg\";\"Shenmue(シェンムー 一章 横須賀,Shenmū Isshō: Yokosuka?, lit. \"\"Shenmue Chapter 1: Yokosuka\"\") is a 1999 adventurevideo game developed by Sega AM2 and published by Sega for the Dreamcast, produced and directed by Yu Suzuki. Suzuki coined a genre title for its nonlinear gameplay, \"\"FREE\"\" (Full Reactive Eyes Entertainment), for the game, based on the interactivity and freedom he wanted to give to the player. Suzuki intended to achieve this by simulating aspects of real life through the game, such as the day and night system, real-time variable weather effects (unheard of in a game of this kind at the time), fully voiced non-player characters with their own daily schedules, quick time events, and various other interactive elements such as vending machines, arcades, and convenience stores.\"\n" +
            "\"Star Citizen\";\"2016\";\"Cloud Imperium Games\";\"PC\";\"Cloud Imperium Games\";\"$53,500,000\";\"\";\"$53,500,000\";\"http://en.wikipedia.org/wiki/Star_Citizen\";\"https://upload.wikimedia.org/wikipedia/en/9/91/Star_Citizen_logo.png\";\"Star Citizen is an upcoming space trading and combat simulator video game for Microsoft Windows and Linux.Star Citizen will consist of two main components: first-person space combat, first-person shooter elements and trading in a massively multiplayerpersistent universe and customizable private servers, and a branching single-player and drop-in co-operative multiplayer campaign (titled Squadron 42). The game is built on a modified CryEngine and will feature Oculus Rift support.\"\n" +
            "\"Star Wars: The Old Republic\";\"2011\";\"BioWare\";\"PC\";\"\";\"$200,000,000\";\"\";\"$200,000,000\";\"http://en.wikipedia.org/wiki/Star_Wars:_The_Old_Republic\";\"https://upload.wikimedia.org/wikipedia/en/3/3c/Star_Wars-_The_Old_Republic_cover.jpg\";\"Star Wars: The Old Republic, often abbreviated as SWTOR, is a massively multiplayer online role-playing game (MMORPG) based in the Star Warsuniverse. Developed by BioWare Austin and a supplemental team at BioWare Edmonton, the game was first announced on October 21, 2008, at an invitation-only press event. The video game was released for the Microsoft Windows platform on December 20, 2011 in North America and part of Europe. Early access to the game began one week before release, on December 13, 2011, for those who had pre-ordered the game online access opened in \"\"waves\"\" based on pre-order date.\"\n" +
            "\"The Secret World\";\"2012\";\"Funcom\";\"PC\";\"Electronic Arts\";\"$50,000,000\";\"\";\"$50,000,000\";\"http://en.wikipedia.org/wiki/The_Secret_World\";\"https://upload.wikimedia.org/wikipedia/en/0/02/Secret_World_cover.jpg\";\"The Secret World is a massively multiplayer online role-playingvideo game set in the modern day real world by developer Funcom. Ragnar Tørnquist is the creative director of the game.\"\n" +
            "\"This Is Vegas\";\"cancelled\";\"Surreal Software\";\"PC, Xbox 360, PS3\";\"Warner Bros. Interactive Entertainment\";\"$50,000,000\";\"\";\"$50,000,000\";\"http://en.wikipedia.org/wiki/This_Is_Vegas\";\"https://upload.wikimedia.org/wikipedia/en/2/2f/This_Is_Vegas_Logo.jpg\";\"This Is Vegas is an unreleased video game that was in development at Surreal Software and was to be published by Warner Bros. Interactive Entertainment on Microsoft Windows, the PlayStation 3, and the Xbox 360. In 2010 development on the game was reportedly cancelled.\"\n" +
            "\"Tom Clancy's Ghost Recon: Future Soldier\";\"2012\";\"Ubisoft Paris\";\"PC, Xbox 360, PS3\";\"Ubisoft\";\"$65,000,000\";\"\";\"$65,000,000\";\"http://en.wikipedia.org/wiki/Tom_Clancy%27s_Ghost_Recon:_Future_Soldier\";\"https://upload.wikimedia.org/wikipedia/en/c/c4/Tom_Clancy_Ghost_Recon_Future_Soldier_Game_Cover.jpg\";\"Tom Clancy's Ghost Recon: Future Soldier is a third-person shooter video game published by Ubisoft and was released for the PlayStation 3 and Xbox 360 consoles on May 22, 2012. The PC version was released on June 26. Future Soldier is the fifth major installment in the Ghost Recon series, and was announced to be in development by Ubisoft on January 22, 2009. The game has a futuristic take on the Ghost Recon series. The campaign has settings such as Nigeria, Pakistan, Russia and Norway.\"\n" +
            "\"Tomb Raider\";\"2013\";\"Crystal Dynamics\";\"PS3, Xbox 360, PC\";\"Square Enix\";\"\";\"\";\"$100,000,000\";\"http://en.wikipedia.org/wiki/Tomb_Raider_(2013_video_game)\";\"https://upload.wikimedia.org/wikipedia/en/f/f1/TombRaider2013.jpg\";\"Tomb Raider is a 2013 action-adventurevideo game published by Square Enix. Tomb Raider is the fourth title developed by Crystal Dynamics in the Tomb Raider franchise. As the first entry in a new Tomb Raider continuity, the game is a reboot that emphasises the reconstructed origins of the culturally influential lead character Lara Croft.Tomb Raider was released on 5 March 2013 for Microsoft Windows, PlayStation 3 and Xbox 360, and on 23 January 2014 for Mac OS X.\"\n" +
            "\"Too Human\";\"2008\";\"Silicon Knights\";\"Xbox 360\";\"Microsoft Game Studios\";\"$100,000,000\";\"\";\"$100,000,000\";\"http://en.wikipedia.org/wiki/Too_Human\";\"https://upload.wikimedia.org/wikipedia/en/7/78/Too_Human.jpg\";\"Too Human is an action role-playing game developed by Canadian developer Silicon Knights and published by Microsoft Studios for the Xbox 360 console.\"\n" +
            "\"Watch Dogs\";\"2014\";\"Ubisoft Montreal\";\"PC, PS3, PS4, Wii U, Xbox 360, Xbox One\";\"Ubisoft\";\"$68,000,000\";\"\";\"$68,000,000\";\"http://en.wikipedia.org/wiki/Watch_Dogs\";\"https://upload.wikimedia.org/wikipedia/en/d/d9/Watch_Dogs_box_art.jpg\";\"Watch Dogs (stylized as WATCH_DOGS) is a 2014 open worldaction-adventurevideo game developed by Ubisoft Montreal and published by Ubisoft. It was released worldwide on 27 May 2014 for Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360 and Xbox One, with a Wii U planned for release on 18 November 2014 in North America and 21 November in Europe. Set within a fictionalized version of Chicago, Illinois, the single-player story follows a hacker and his efforts to seek revenge after the accidental death of his niece. The open world design lets players freely roam Chicago, which includes the urban city, open countryside, and slums.\"\n" +
            "\"World of Warcraft\";\"2004\";\"Blizzard Entertainment\";\"PC\";\"Blizzard Entertainment\";\"$60,000,000\";\"\";\"$60,000,000\";\"http://en.wikipedia.org/wiki/World_of_Warcraft\";\"https://upload.wikimedia.org/wikipedia/en/9/91/WoW_Box_Art1.jpg\";\"World of Warcraft (WoW) is a massively multiplayer online role-playing game (MMORPG) created in 2004 by Blizzard Entertainment. It is the fourth released game set in the fantasy Warcraft universe, which was first introduced by Warcraft: Orcs & Humans in 1994.World of Warcraft takes place within the Warcraft world of Azeroth, approximately four years after the events at the conclusion of Blizzard's previous Warcraft release, Warcraft III: The Frozen Throne. Blizzard Entertainment announced World of Warcraft on September 2, 2001. The game was released on November 23, 2004, on the 10th anniversary of the Warcraftfranchise.\"";

    public List<VideoGame> getVideoGames() {
        input = input.replace("\"", "");
        input = input.replace("cancelled", "-1");
        return Arrays.stream(input.split("\n"))
                .map(i -> i.split(";"))
                .map(i -> new VideoGame(i[0], i[2] ,Integer.parseInt(i[1]), i[3].split(", ")))
                .toList();
    }
}
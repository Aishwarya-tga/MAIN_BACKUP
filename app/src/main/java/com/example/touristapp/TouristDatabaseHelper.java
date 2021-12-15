package com.example.touristapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

class TouristDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "tourist";
    private static final int DB_VERSION = 7;
    private static final String KERALA = "kerala";
    private static final String TAMIL = "tamil";
    private static final String RAJASTHAN = "rajasthan";
    private static final String UTTAR = "uttar";
    private static final String DELHI = "delhi";
    private static final String PUNJAB = "punjab";
    private static final String GOA = "goa";

    TouristDatabaseHelper(Context context) {
        super(context, DB_NAME,null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE KERALA (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "DETAIL TEXT,"
                + "AREA TEXT,"
                + "ELEVATION TEXT,"
                + "TYPE TEXT,"
                + "BTTV TEXT,"
                + "DEST TEXT,"
                + "IMAGE_RESOURCE_ID INTEGER,"
                + "RATING TEXT);");

        insertKerala(db,"Alappuzha","Alappuzha, famous for its boat races, beaches, marine products and coir industry, is a world renowned backwater tourist destination of India. Kuttanad, Alappuzha backwaters and Alappuzha beach are the must-see tourist attractions in the district.\n","AREA : 46.2 km²\n","ELEVATION : 11 m\n","TYPE : Beaches, Backwater canals\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Alappuzha Beach , Marari Beach , Punnapra Beach\n", R.drawable.alappuzha,"4.5");
        insertKerala(db,"Munnar","Located at the Western Ghats with an average elevation of 1700 meters above sea level, Munnar is a famous hill station in Kerala. The hill station enjoys a favorable and pleasant climate all year round and is famous for its lush green hills and tea plantations.\n","AREA: 187 km²\n","ELEVATION : 1,532 m\n","TYPE : Hill station\n","BEST TIME TO VISIT : August to March\n","TOURIST DESTINATION : Echo Point , Attukad Waterfalls , Top Station\n",R.drawable.munnar,"4.3");
        insertKerala(db,"Kumarakom","Kumarakom is a popular tourism destination located near the city of Kottayam (10 kilometres (6 mi)), in Kerala, India, famous for its backwater tourism. It is set in the backdrop of the Vembanad Lake, the largest lake in the state of Kerala.\n","AREA : Located near the city of Kottayam 10 kilometres (6 mi)\n","ELEVATION : 9.84 feet\n","TYPE : Verdant Green Village, Lake\n","BEST TIME TO VISIT : September to March\n","TOURIST DESTINATION : Kumarakom Bird Sanctuary , Aruvikkuzhi Waterfall , Vembanad Lake\n",R.drawable.kumarakom,"4.4");
        insertKerala(db,"Wayanad","Wayanad is famous for its large amount of camping and trekking trails, breathtaking waterfalls, caves, bird watching sites, flora, fauna and an overall plethora of magnificent sights. This area has been a tourist favourite over the years.\n","AREA : 2,132 km²\n","ELEVATION : 2,339 m\n","TYPE : Hill Station, Waterfalls\n","BEST TIME TO VISIT : October to February\n","TOURIST DESTINATION : Edakkal Caves , Kuruva Island , Chembra Peak\n",R.drawable.wayanad,"4.3");
        insertKerala(db,"Kochi","Popularly known as the Queen of Arabian Sea, the city also flaunts one of the finest natural harbours of the world and was the centre of the world spice trade for many centuries. Old Kochi (presently called West Kochi), loosely refers to a group of islands which comprise Willingdon Island, Fort Kochi, Mattancherry etc.\n","AREA : 94.88 km²\n","ELEVATION : 0 cm\n","TYPE : Harbour\n","BEST TIME TO VISIT : September to March \n","TOURIST DESTINATION : Chottanikara Bhagavathy Temple , Folklore Museum , Andhakaranazhi Beach\n",R.drawable.kochi,"4.0");
        insertKerala(db,"Kovalam","Kovalam is the home to some of the most picturesque and playful beaches in the country. While in here, you can stroll around, indulge in beach activities or in other fun-filled activities.\n","AREA : Located only 16km from Thiruvananthapuram\n","ELEVATION : 19 meters\n","TYPE : Beaches\n","BEST TIME TO VISIT : September to March\n","TOURIST DESTINATION : Vellayani Lake, Lighthouse Beach, Chowara Beach, Kovalam Beach, Hawah Beach, Samudra Beach \n",R.drawable.kovalam,"4.0");
        insertKerala(db,"Kozhikode"," Kozhikode or Calicut is esteemed as one of the diverse and best places to visit in Kerala. Dotted with an array of historical landmarks, tourist spots and attractions, this wonderful city is also a lively reminiscent of the Dutch and British eras in India.\n","AREA : 118 km²\n","ELEVATION : 1m\n","TYPE : Coastal town, Historical forts\n","BEST TIME TO VISIT : July to April\n","TOURIST DESTINATION : Kappad Beach, Kozhikode Beach, Beypore Beach,Krishna Menon Museum, Peruvannamuzhi Dam\n",R.drawable.kozhikode,"3.5");
        insertKerala(db,"Idukki","A gem in the lap of the mighty Western Ghats, Idukki boasts of being one of the evergreen and pristine districts in Kerala. Canopied by lush vegetation, this part of ‘India’s Backwater Capital’ has a unique charm and attracts visitors from almost all the corners of the globe.\n","AREA : 4,358 km²\n","ELEVATION : 1,200 m\n","TYPE : Wildlife sanctuaries, Tea factories, Rubber plantations and Forests\n","BEST TIME TO VISIT : Year-round Destination\n","TOURIST DESTINATION : Periyar National Park, Periyar Lake, Idukki Arch Dam, Kulamavu Dam, Anakkara\n",R.drawable.idukki,"4.6");
        insertKerala(db,"Thrissur","Being edged with a number of scared temples and other religious spots, Thrissur serves as an important pilgrimage among the Hindu devotees. Yes, this city is the venue ground of the famous ‘Temple Festival’ or the ‘Thrissur Pooram’ that is known and participated by devotees from across the globe.\n","AREA : 101.4 km²\n","ELEVATION : 2.83 m\n","Temples\n","BEST TIME TO VISIT : Year-round Destination / April to May\n","TOURIST DESTINATION : Thiruvambadi Sri Krishna Temple, Dolours Basilica, ParamekkavuBhagavathy Temple, Arattupuzha Temple\n",R.drawable.thrissur,"4.1");
        insertKerala(db,"Ponmudi","If you still think that Kerala is all about backwaters, mighty ocean, playful beaches, spice gardens, or evergreen coconut groves, you must visit the stunning hill station called Ponmudi!.Enchanted by the spellbinding beauty of the Western Ghats, a drive or ride to Ponmudi has its own fun and excitement.\n","AREA : Around 55km away from the Thiruvananthapuram\n","ELEVATION :  1,100 m\n","TYPE : Hill Station\n","BEST TIME TO VISIT : November to May\n","TOURIST DESTINATION : Golden Valley, Mini Zoo, Peppara wildlife Sanctuary\n",R.drawable.ponmudi,"4.0");

        db.execSQL("CREATE TABLE TAMIL (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "NAME TEXT, "
                + "DETAIL TEXT, "
                + "AREA TEXT, "
                + "ELEVATION TEXT, "
                + "TYPE TEXT ,"
                + "BTTV TEXT, "
                + "DEST TEXT,"
                + "IMAGE_RESOURCE_ID INTEGER,"
                + "RATING TEXT);");

        insertTamil(db,"Chennai","Famous as the biggest cultural and economic centre down south, Chennai was earlier known as Madras. The city houses several Hindu temples, churches and museums. From its white-sand beaches to mouth-watering seafood, Chennai has everything for travellers.\n","AREA : 426 km²\n","ELEVATION : 6.7 m\n","TYPE : Cultural centre\n","BEST TIME TO VISIT: November to Februray\n","TOURIST DESTINATION : Marina Beach, Birla Planetarium, Valluvar Kottam.\n",R.drawable.chennai,"4.3");
        insertTamil(db,"Thanjavur","Thanjavur is an important center of South Indian religion, art, and architecture. Most of the Great Living Chola Temples, which are UNESCO World Heritage Monuments, are located in and around Thanjavur. The foremost among these, the Brihadeeswara Temple, is located in the centre of the city.\n","AREA : 128 km²\n","ELEVATION : 88 m\n","TYPE : Temples\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Brihadeeswara Temple, Gangaikonda Cholapuram, Thanjavur Royal Palace.\n",R.drawable.thanjavur,"4.8");
        insertTamil(db,"Ooty","Ooty is one of the important and Interesting Tourist spots of Tamil Nadu. This place has very cool and chill climate in summer season so it one of the best known hill resorts of India. The other name of Ooty is Udhagamandalam. It is also called as the “Queen of Hills Stations” \n","AREA : 36 sq.kms\n","ELEVATION : 2,240 m\n","TYPE : Hill Station\n","BEST TIME TO VISIT : October to June\n","TOURIST DESTINATION : Avalanche Lake, Ooty Botanical Gardens, Doddabetta Peak.\n",R.drawable.ooty,"4.2");
        insertTamil(db,"Rameshwaram","Rameshwaram is also a popular pilgrimage destination. The town has special significance to Hindus as one of the holy Char Dham—the four sacred abodes associated with incarnations of Lord Vishnu. ... Hindus believe that visiting all the Char Dham will help them achieve moksha (liberation from rebirth).\n","AREA : 55 km²\n","ELEVATION : 10 m\n","TYPE : Temples , Beaches\n","BEST TIME TO VISIT : October to April\n","TOURIST DESTINATION : Sri Ramanathaswamy Temple, Dhanushkodi Beach, Adam’s Bridge.\n",R.drawable.rameshwaram,"4.5");
        insertTamil(db,"Madurai","The city has a number of historical monuments, with the Meenakshi Temple and the Tirumalai Nayak Palace being the most prominent. Madurai is an important industrial and educational hub in South Tamil Nadu. The city is home to various automobile, rubber, chemical and granite manufacturing industries.\n","AREA : 148 km²\n","ELEVATION :  101 m\n","TYPE : Temples\n","BEST TIME TO VISIT : October to March \n","TOURIST DESTINATION : Meenakshi Amman Temple, Thirumalai Nayakkar Mahal, Vaigai Dam.\n",R.drawable.madurai,"4.7");
        insertTamil(db,"KanyaKumari","Kanyakumari is the southernmost point of peninsular India and the meeting point of three oceans-the Bay of Bengal, the Arabian Sea and the Indian Ocean. Besides its importance as a Hindu pilgrim center, it is famous for its beautiful views of sunrise and sunset over the waters.\n","AREA : 25.89 km²\n","ELEVATION :  30 m\n","Beaches,Temples\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Vivekananda Rock Memorial, Thiruvalluvar Statue, Kanyakumari Beach, Kumari Amman Temple .\n",R.drawable.kanyakumari,"4.5");
        insertTamil(db," Mahabalipuram","Also known as Mamallapuram, the city of Mahabalipuram is famous for its ancient and cultural heritage. The city of Mahabalipuram was a prominent sea port dating back to 7th century AD and was ruled by the Pallava Dynasty. The place is famous for its monuments and is classified among the UNESCO world heritage sites.\n","AREA : Located 60 miles south of chennai south\n","ELEVATION :  12 m\n","TYPE : Historical Heritage site\n","BEST TIME TO VISIT : November to February\n","TOURIST DESTINATION : Arjuna’s Penance, Thirukadalmallai, Cave Temples, Shore Temple, Pancha Rathas\n",R.drawable.mahabalipuram,"4.7");
        insertTamil(db," Kodaikanal","The town is also referred to as the ‘Princess of the Hill stations’ with its name meaning ‘the Gift of the Forest’. It is a small hill station with an average elevation of 2,331 meters above sea level. The place is surrounded by thick forests and is located at the top of the Palani Hills.Kodaikanal is famous for its scenic beauty and has a number of natural attractions that is the reason for its high tourist population.\n","AREA : 21.45 km²\n","ELEVATION : 2,133 m\n","TYPE : Hill station.\n","BEST TIME TO VISIT : April to June\n","TOURIST DESTINATION : Berijam Lake, Coakers Walk, Kodai Lake, Green Valley View\n",R.drawable.kodaikanal,"4.3");
        insertTamil(db," Kanchipuram","The city of Kanchipuram is located on the shores of the Vegavathy River. The city has seen a number of ruling dynasties and monarchies such as the Pandya, Cholas, the Vijaynagar Empire, the Carnatic kingdom and the British monarchy. Kanchipuram since medieval times has been significant as the educational center and was known as the place for learning.\n","AREA : 1,448 km²\n","ELEVATION : 85 m\n","TYPE : Temples\n","BEST TIME TO VISIT : Year-round Destination\n","TOURIST DESTINATION : Ekambareswarar Temple, Kamakshi Amman Temple, Kanchi Kudil\n",R.drawable.kanchipuram,"4.7");
        insertTamil(db," Vellore","Also known as, the Fort city, Vellore is located at the banks of Palar River at the North-eastern part of Tamil Nadu. The city came under the reign of various kingdoms and monarchies such as the Pallava, the Chola, the Carnatic Kingdom and the British.The place has a lot of historic relevance as well, as the fort of Vellore is said to have housed Tipu sultan’s family during the British Rule.\n","AREA : 87.92 km²\n","ELEVATION : 216 m\n","TYPE : Forts , Temples\n","BEST TIME TO VISIT : November to February\n","TOURIST DESTINATION : Vellore Fort, Jalakandeswarar Temple, Yelagiri, Srilakshmi Golden Temple\n",R.drawable.vellore,"4.4");



        db.execSQL("CREATE TABLE RAJASTHAN (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "NAME TEXT, "
                + "DETAIL TEXT, "
                + "AREA TEXT, "
                + "ELEVATION TEXT, "
                + "TYPE TEXT, "
                + "BTTV TEXT, "
                + "DEST TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER, "
                + "RATING TEXT);");

        insertRajasthan(db,"Jaipur","Jaipur is famous as Pink City of India and it is also the Capital City of Rajasthan. Jaipur is famous for Rajasthani traditional Jewelry, traditional fabrics and handicrafts, and also for traditional rajasthani cuisine\n","AREA : 484.6 km²\n","ELEVATION : 431 m\n","TYPE : Forts , Palaces\n", "BEST TIME TTO VISIT : November to January\n","TOURIST DESTINATION :  City Palace, Jantar Mantar, Hawa Mahal\n",R.drawable.jaipur,"4.5");
        insertRajasthan(db,"Udaipur","Picturesque and elegant, Udaipur is known by many names, including “the City of Lakes”. Undoubtedly one of India's most romantic cities, it nestles between the glassy waters of its famous lakes and the ancient Aravelli Hills.\n","AREA :  64 km²\n","ELEVATION :  423 m\n","TYPE : lakes\n","BEST TIME TO VISIT : September to March\n","TOURIST DESTINATION : Udaipur City Palace,  Lake Pichola, Fateh Sagar Lake\n", R.drawable.udaipur,"4.6");
        insertRajasthan(db,"Jaisalmer","The city is known for the grand fort that fences the city and other tourist attractions in Jaisalmer.The most amazing thing about this fort is that it is a living urban center.Taking a city sightseeing tour is one of the most desired things to do in Jaisalmer.\n","AREA : 5.1 km²\n","ELEVATION : 225 m\n","TYPE : Forts, Sand Castles\n","BEST TIME TO VISIT : November to March\n","TOURIST DESTINATION : Jaisalmer Fort, Bada Bagh, Sam Sand Dunes\n",R.drawable.jaisalmer,"4.1");
        insertRajasthan(db,"Jodhpur","Jodhpur is a popular tourist destination, featuring many palaces, forts, and temples, set in the stark landscape of the Thar Desert. It is popularly known as the 'Blue City' among people of Rajasthan and all over India.\n","AREA : 233.5 km²\n","ELEVATION : 231 m\n","TYPE : Forts, Temples\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Umaid Bhawan Palace,  Mehrangarh Fort,  Jaswant Thada\n",R.drawable.jodhpur,"4.4");
        insertRajasthan(db,"Pushkar","Known as 'the rose garden of Rajasthan', the essence of the famous Pushkar rose is exported all over the world. Along with an interesting mythological history, a legacy of timeless architectural heritage makes Pushkar a fascinating city.\n","AREA :  10 km (6.2 mi) northwest of Ajmer \n","ELEVATION : 510 m\n","TYPE : Temples\n","BEST TIME TO VISIT : November to March\n","TOURIST DESTINATION : Pushkar Lake, Brahma Temple, Savitri Temple\n",R.drawable.pushkaar,"4.6");
        insertRajasthan(db,"Dausa","Dausa is a small ancient town named after a Sanskrit word Dhau-sa meaning Beautiful like Heaven.Also referred as Deva Nagri, located around 55 km from Jaipur, on National Highway 11. The city was the first headquarter of the former Kachhawaha Dynasty and has much history and archaeological importance linked to it.\n","AREA : 3,432 km²\n","ELEVATION : 327m\n","TYPE : Histotical Monuments\n","BEST TIME TTO VISIT :  September to late October\n","TOURIST DESTINATION : Harshat Mata Temple, Bhandrej, Lotwara\n",R.drawable.dausa,"4.4");
        insertRajasthan(db,"Bikaner","The city of Bikaner was founded in 1488 by the Rathore Rajput Ruler Rao Bika .The land was usurped from the rivaling Jat rulers of that time. today Bikaner is another prime tourist destination and is famous for its sweets and snacks. The place is known for its forts and food.\n","AREA : 270 km²\n","ELEVATION : 242 m\n","TYPE : Temples , Culture\n","BEST TIME TO VISIT : October to March.\n","TOURIST DESTINATION : Junagarh Fort, Shri Laxminath Temple, Jain Temple, Sadul Singh Museum\n",R.drawable.bikaner,"4.5");
        insertRajasthan(db,"Sawai Madhopur","Sawai Madhopur was built by Maharaja Sawai Madho Singh of The Kachwaha Rajputs and was founded in 1763.While the town itself doesn’t have any notable tourist attractions, just two attractions have made this city a must visit place in Rajasthan. They are the Ranthambore Fort and the Ranthambore National park.\n","AREA : 59 km²\n","ELEVATION :  257 m\n","TYPE : Temples, Forts\n","BEST TIME TO VISIT : October to April\n","TOURIST DESTINATION : Ranthambore National Park, Ranthambore Fort, Chamatkar Temple\n",R.drawable.sawai,"4.6");
        insertRajasthan(db,"Chittorgarh","The ancient city of Chittorgarh also known as Chittor, was said to have been founded by the Maurya Dynasty. The city being an ancient place contains many different palaces, temples and forts which display some of the most advanced architectural designs and artistic mastery.\n","AREA : 41 km²\n","ELEVATION : 395 m\n","TYPE : Temples , Forts\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Chittogarh Fort, Meera Temple, Vijay Stambh, Rani Padmini Palace\n",R.drawable.chittogarh,"4.5");
        insertRajasthan(db,"Ajmer","Ajmer is surrounded by Aravalli ranges and is a city seeped in both history and culture. It lies near Pushkar, a major Hindu pilgrimage site and is the home of the shrine of Khwaja Moinuddin Chishti. This makes it a unique pilgrimage site for both Hindus and Muslims.\n","AREA :  55 km²\n","ELEVATION : 480 m\n","TYPE : Temples, Dargah\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Ajmer Sharif Dargah, Taragarh Fort, Adhai Din Ka Jhonpra\n",R.drawable.ajmer,"4.1");



        db.execSQL("CREATE TABLE UTTAR (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "NAME TEXT, "
                + "DETAIL TEXT, "
                + "AREA TEXT, "
                + "ELEVATION TEXT, "
                + "TYPE TEXT, "
                + "BTTV TEXT, "
                + "DEST TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER, "
                + "RATING TEXT);");

        insertUttar(db,"Agra","Located on the banks of Yamuna, Agra is best known for the iconic Taj Mahal. However, the appeal of this historic city is not limited to this magnificent monument alone. There's a lot to explore and experience, from monuments and mausoleums to parks and bazaars.\n","AREA : 121 km²\n","ELEVATION : 170 m\n","TYPE : Monuments\n"," BEST TIME TO VISIT : October to March\n","TOURIST DESTINATOIN : Taj Mahal,  Agra Fort, Akbar's Mausoleum\n",R.drawable.agra,"4.5");
        insertUttar(db,"Varanasi","Varanasi grew as an important industrial centre famous for its muslin and silk fabrics, perfumes, ivory works, and sculpture. Buddha is believed to have founded Buddhism here around 528 BCE when he gave his first sermon,The Setting in Motion of the Wheel of Dharma,'at nearby Sarnath'.\n","AREA : 82 km²\n","ELEVATION : 81 m\n","TYPE : Temple\n","BEST TIME TO VISIT : November to February\n","TOURIST DESTINATION : Kashi Vishwanath Temple, Durga Mandir, Bharat Mata Mandir\n", R.drawable.varanasi,"4.7");
        insertUttar(db,"Lucknow","Lucknow is a historically important city and for many centuries was at the heart of North Indian culture. In particular, the city was famous for its Adab and Tehzeeb (manners and hospitality), intricate embroidery, beautiful gardens and dance forms such as Kathak.\n","AREA : 631 km²\n","ELEVATION : 123 m\n","TYPE : Temple, Museums\n","BEST TIME TO VISIT : November to February\n","TOURIST DESTINATION : Bara Imambara, Hazratganj Market, Rumi Darwaza\n",R.drawable.lucknow,"4.2");
        insertUttar(db,"Allahabad","It was constructed by… Prayag in modern-day Allahabad is believed to be the most important pilgrimage centre for Hindus. Traditionally river confluences are regarded… Allahabad University was established on 23rd of September, 1887; it is the fourth oldest university in India.\n","AREA : 365 km²\n","ELEVATION : 98 m\n","TYPE : Museum, University\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Triveni Sangam,  Allahabad Museum, Allahabad Fort\n",R.drawable.allahabad,"4.3");
        insertUttar(db,"Mathura","Mathura (or Brajbhoomi) is famous as the birthplace of Lord Krishna, an important deity in the Hindu religious pantheon. It is an important pilgrim place of the Hindus and one of the seven sacred cities in India. The main pilgrim center in Mathura is the Shri Krishna Janmabhoomi temple.\n","AREA :  28 km²\n","ELEVATION :  174 m\n","TYPE : Temple\n","BEST TIME TO VISIT : October to November\n","TOURIST DESTINATION : Sri Krishna Janmabhoomi Temple,  Dwarkadhish Temple, Mathura Museum\n",R.drawable.mathura,"4.8");
        insertUttar(db,"Fatehpur Sikri","Fatehpur Sikri, the 16th century city, was built by the renowned Mughal emperor Akbar. Though the city was at its glorious height only for a short period owing to scarcity of water, its breathtaking architecture makes the city eternally famous.\n","AREA : Located 37 km west-southwest of Agra\n","ELEVATION : 54 m\n","TYPE : Forts\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Panch Mahal, Johbhai Palace, Lotus Throne\n",R.drawable.fatepur,"4.0");
        insertUttar(db,"Vrindavan","Vrindavan is an important destination for pilgrims belonging to Hinduism, as it is associated with Lord Krishna. Most of the temples found here are ancient. Located near Mathura, these two cities are considered twin holy cities\n","AREA : Located in Mathura\n","ELEVATION : 170 m\n","TYPE : Temples\n","BEST TIME TO VISIT : September to March\n","TOURIST DESTINATION : Yamuna River, Govind Dev Temple, Iskcon Temple, Kesi Ghat\n",R.drawable.vrindavan,"4.2");
        insertUttar(db,"Jhansi","Well-known cities and the lesser-known cities of Uttar Pradesh have a blend of religion, history, natural beauties and architectural excellence and hence you may not be surprised to note that Jhansi has its share in the common trait of the land.\n","AREA : 160 km²\n","ELEVATION : 285 m\n","TYPE : Forts, Mahal\n","BEST TIME TO VISIT : November and March\n","TOURIST DESTINATION : Jhansi Fort, Rani Mahal, Chirgaon, Parichha\n",R.drawable.jhansi,"4.4");
        insertUttar(db,"Kushinagar","Kushinagar is a popular Buddhist pilgrim center. This ancient city gains more importance, as this was where Lord Buddha made his last sermon. The historic significance of the place can be gauged by the archaeological evidences unearthed from here.\n","AREA : 2,874 km²\n","ELEVATION : 80m\n","TYPE : Pilgrim Center\n","BEST TIME TO VISIT : November to February\n","TOURIST DESTINATION : Sun Temple, Mahaparinirvana Temple, Kushinagar Museum, Ramabhar Stupa\n",R.drawable.kushinagar,"4.0");
        insertUttar(db,"Meerut","Meerut is an ancient city and many of its historical buildings date back to the era of the Indus Valley Civilization.The place is considered to be an important historical town and has plenty of monuments and memorials that can be visited.\n","AREA : 450 km²\n","ELEVATION : 247 m\n","TYPE : Historical Towns\n","BEST TIME TO VISIT : October to February\n","TOURIST DESTINATION : Augharnath Mandir, Hastinapur Wildlife Sanctuary, Mansa Devi Temple\n",R.drawable.meerut,"3.9");

        db.execSQL("CREATE TABLE DELHI (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "NAME TEXT, "
                + "DETAIL TEXT, "
                + "AREA TEXT, "
                + "HEIGHT TEXT, "
                + "TYPE TEXT, "
                + "BTTV TEXT,"
                + "IMAGE_RESOURCE_ID INTEGER, "
                + "RATING TEXT);");

        insertDelhi(db,"India Gate","India Gate, an important monument of the city, is a memorial built in commemoration of more than 80,000 Indian soldiers who were killed during World War I. The monument is an imposing 42 meters high arch and was designed by the famous architect Edwin Lutyens. India gate was earlier named All India War Memorial.\n","AREA : 306,000 sqkm\n","HEIGHT :42m\n","TYPE : War Memorial\n","BEST TIME TO VISIT : 07:00 PM and 09:30 PM\n",R.drawable.indiagate,"4.0");
        insertDelhi(db,"The Red Fort","Delhi's famous Red Fort is known by that name because of the red stone with which it is built and it is one of the most magnificent palaces in the world. India's history is also closely linked with this fort.\n","AREA : 94 acres (38 ha)\n","HEIGHT : 70 feet\n","TYPE : Fort\n","BEST TIME TO VISIT : November to March\n",R.drawable.redfort,"4.4");
        insertDelhi(db,"Qutub Minar","Qutub Minar is one of the highest minarets in India with a height of 73 metres. It is a UNESCO World Heritage Site and the tallest brick minaret in the world. This 12th-century minaret is considered as the earliest Islamic structure in India with both Arabic and Brahmi inscriptions.\n","AREA : Diameter of 14.32m at the base\n","HEIGHT :  73m\n","TYPE : Monument\n","BEST TIME TO VISIT : 7:00 am to 5:00 pm\n",R.drawable.qutub,"4.0");
        insertDelhi(db,"The Lotus Temple","The temple was completed in 1986 and is one of the most visited places in the world. There are nine sides to the temple formed by 27 marble petals, arranged in groups of three. The nine doors lead to a central prayer hall that has a capacity of 2500 people and is about 40m high.\n","AREA :  Diameter OF 70 metres (230 ft)\n","HEIGHT : 34.27 m\n","TYPE : House of Worship\n","BEST TIME TO VISIT :  October to March\n",R.drawable.lotus,"4.2");
        insertDelhi(db,"Jama Masjid","Built in 1656, it is an eloquent reminder of the Mughal religious fervour. Its spacious courtyard holds thousands of the faithful who offer their prayers here. It's also known as 'Masjid-i-Jahanuma' or 'Mosque commanding view of the world'. It was designed as Emperor Shahjahan's principal mosque.\n","AREA : 12.7 Hectares\n","HEIGHT : 41 m\n","TYPE : Mosque\n","BEST TIME TO VISIT :  12:00 pm,and 2:00 pm to 4:00 pm\n",R.drawable.jama,"4.6");
        insertDelhi(db,"Gurudwara Bangla Sahib","Delhi's most important Sikh place of worship, the 18th-century Gurdwara Bangla Sahib is near Connaught Place and is well worth a visit. Highlights include its magnificent pool, the Sarovar, at the heart of this large complex, as well as its famous gold dome and flagpole.\n","AREA : Located near Connaught Place\n","HEIGHT : 239 m\n","TYPE : House of Worship\n","BEST TIME TO VISIT : January to December\n",R.drawable.gurudwara,"4.0");
        insertDelhi(db,"Humayun's Tomb","Set in a lovely, large square garden, Humayun's Tomb is a lofty mausoleum constructed of white marble and red sandstone. It was designed as a prototype of the Taj Mahal in Agra and is an excellent example of Mughal architecture.A fun thing to do is to try and catch a glimpse of this spectacular structure after nightfall when it's illuminated.\n","AREA : 27.04 ha\n","HEIGHT : 47 meters\n","TYPE : Garden tomb\n","BEST TIME TO VISIT :  October to March\n",R.drawable.humayun,"4.0");
        insertDelhi(db,"Akshardham","Although only recently completed (it opened in 2007), the splendid Hindu Akshardham temple looks like it could be centuries old. Festooned with intricate and elaborate carvings, this magnificent building attracts countless visitors for its majestic beauty.\n","AREA : 86,342 sq ft\n","HEIGHT : 43 m\n","TYPE : Temple\n","BEST TIME TO VISIT : September to April\n",R.drawable.akshardham,"4.5");
        insertDelhi(db,"Rajpath and Rashtrapati Bhavan","Rajpath, also known as the King's Way, is New Delhi's traditional ceremonial boulevard. This broad avenue is flanked by trees, grass, and ponds and comes alive each January 26th during the Republic Day Parade, when countless thousands gather to celebrate the anniversary of the country's independence. \n","AREA : 200,000 sq ft\n","HEIGHT : 145 ft\n","TYPE : Ceremonial Boulevard\n","BEST TIME TO VISIT : Year-round destination\n",R.drawable.rajpath,"4.4");
        insertDelhi(db,"The Jantar Mantar Observatory","one of New Delhi's largest and best-known business districts, Jantar Mantar is one of five astronomical observatories constructed by Maharajah Jai Singh I in 1725. Highlights of this remarkable and architecturally pleasing building include an enormous sundial known as the Prince of Dials.\n","AREA : Located near Connaught Place\n","HEIGHT : 723 feet\n","TYPE : Astronomical Observatory Site\n","BEST TIME TO VISIT : October to March\n",R.drawable.jantar,"4.0");

        db.execSQL("CREATE TABLE PUNJAB (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "NAME TEXT, "
                + "DETAIL TEXT, "
                + "AREA TEXT, "
                + "ELEVATION TEXT, "
                + "TYPE TEXT, "
                + "BTTV TEXT, "
                + "DEST TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER, "
                + "RATING TEXT);");

        insertPunjab(db,"Amristar","Amritsar is the largest and most important city in Punjab and is a major commercial, cultural, and transportation centre. It is also the centre of Sikhism and the site of the Sikhs' principal place of worship—the Harmandir Sahib, or Golden Temple.\n","AREA :139 km²\n","ELEVATION : 234 m\n","TYPE : Temple\n","BEST TIME TO VISIT : November to March\n","TOURIST DESTINATION : Golden Temple, Jallianwala Bagh, Wagah Border\n",R.drawable.amristar,"4.9");
        insertPunjab(db,"Chandigarh","Also called the city beautiful, Chandigarh was designed by the Swiss-French modernist architect, Le Corbusier. Apart from the city's architecture and buildings like Capitol Complex, High Court, Secretariat, Legislative Assembly and giant Open Hand Monument, it is also famous for its clean roads and greenery.\n","AREA : 114 km²\n","ELEVATION :  321 m\n","TYPE : Monuments, Statues\n","BEST TIME TO VISIT :  September to November\n","TOURIST DESTINATOIN : The Rock Garden, Rose Garden, Sukhna Lake\n",R.drawable.chandigarh,"4.6");
        insertPunjab(db,"Ludhiana","Ludhiana is also famous for its industry of shawls and stoles and satisfies the demand of major domestic and international brands. As a result of its dominance in the textile industry it is often dubbed as the Manchester of India.\n","AREA : 159 km²\n","ELEVATION : 247 m\n","TYPE : Fort, Museum\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Lodhi Fort, Rural Heritage Museum, Maharaja Ranjit Singh War Museum\n",R.drawable.ludhiana,"3.0");
        insertPunjab(db,"Jalandhar","Jalandhar is famous for its sports industry and equipment manufactured in Jalandhar has been used in many international sporting games including Olympics, Commonwealth Games, Asian Games, among others. It is also a hub for manufacturing of hand tools.\n","AREA : 110 km²\n","ELEVATION :  228 m\n","TYPE : Historical sites\n","BEST TIME TO VISIT : January to March\n","TOURIST DESTINATION : Imam Nasir Masjid, Tulsi Mandir, Devi Talab Mandir\n",R.drawable.jalandhar,"4.1");
        insertPunjab(db,"Pathankot","Pathankot was known for Loi and shawl weaving industry for many centuries. Pathankot currently houses the base for the defence forces - Indian Army and the Indian Air Force.\n","AREA :  19.7 km²\n","ELEVATION :  332 m\n","TYPE : Hill Station\n","BEST TIME TO VISIT : October to April\n","TOURIST DESTINATION : Mukteshwar Temple, Kathgarh Temple, Shahpurkandi Fort\n",R.drawable.pathankot,"4.4");
        insertPunjab(db,"Bhatinda","The City of Lakes, Bhatinda is a simple city, which still is among the tourist places in Punjab you cannot miss.The city narrates legendary tales of the past as the remnants stand as witnesses.It is one of the best places to visit in Punjab with family.\n","AREA :3,385 km²\n","ELEVATION : 210 m\n","TYPE : Landmarks\n","BEST TIME TO VISIT : October and March\n","TOURIST DESTINATION : Qila Mubarak, Rose Garden, Jogger’s Park\n",R.drawable.bhatinda,"4.3");
        insertPunjab(db,"Patiala","The fourth largest city of the state, Patiala is name we see featured in list of beautiful places in Punjab quite often. It is also called the City of Newspapers, and the monuments here showcase a blend of different architectural styles such as Mughal, Rajput and of course Punjab.\n","AREA : 155.4 km²\n","ELEVATION : 257 m\n","TYPE : Sights and Landmarks\n","BEST TIME TO VISIT : October to February\n","TOURIST DESTINATION : Moti Bagh Palace,  Kali Mata Mandir, Bahadurgarh Fort\n",R.drawable.patiala,"4.2");
        insertPunjab(db," Kapurthala","One of the less-known places to visit in Punjab, Kapurthala is known as the Paris of Punjab, owing to its intriguing architectural scenario. Most landmarks here are built in French and Indo-Saracen styles of architecture.\n","AREA : 1,633 km²\n","ELEVATION : 225 m\n","TYPE : Landmarks\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Jagatjit Palace,  Elysee Palace, Moorish Mosque\n",R.drawable.kapurthala,"4.4");
        insertPunjab(db,"Nangal","One of the offbeat places to visit in Punab, Nangal is a perfect one day getaway from Chandigarh.Lay your eyes on beautiful Shivalik Hills from this point. Enjoy a sunny winter afternoon in Satluj Park and celebrate 500 years of Sikh history at Virasat-e-Khalsa.\n","AREA : Located at a distance of 60 km from Rupnagar\n","ELEVATION : 326 m\n","TYPE : Dam, Temples\n","BEST TIME TO VISIT :  October to November\n","TOURIST DESTINATOIN :  Bhakra Nangal Dam, Satluj Park, Sheetla Devi Temple, Nangal wetlands\n",R.drawable.nangal,"4.4");
        insertPunjab(db,"Ropar","If you are looking for places to visit near Jalandhar, Punjab, Ropar is a close one. Also known as Roopnagar, Ropar is an ancient town in Punjab which is more famous for its ruin from Harrapan civilization.\n","AREA : 13.65 km²\n","ELEVATION :  262 m\n","TYPE : Historical Importance\n","BEST TIME TO VISIT : January and Februray\n","TOURIST DESTINATION : Anandpur Sahib, Ropar Wetland, Jatweshwar Mahadev Temple\n",R.drawable.ropar,"4.3");

        db.execSQL("CREATE TABLE GOA (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "NAME TEXT, "
                + "DETAIL TEXT, "
                + "AREA TEXT, "
                + "ELEVATION TEXT, "
                + "TYPE TEXT, "
                + "BTTV TEXT, "
                + "DEST TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER, "
                + "RATING TEXT);");

        insertGoa(db,"Panaji","The state in western India is known for its beaches, colonial buildings, cuisine and the easy going lifestyle. Panaji remains the most famous tourist destination in Goa, in terms of beaches, churches, carnivals and natural beauty. Being the capital city, it is the focal point of tourism in Goa.\n","AREA :  8.27 km²\n","ELEVATION :  7m\n","TYPE : Fort, Beaches\n","BEST TIME TO VISIT : October to February\n","TOURIST DESTINATION : Reis Magos Fort, Fort Aguada, Old Goa\n",R.drawable.panaji,"4.4");
        insertGoa(db,"Vasco Da Gama","Vasco da Gama was best known for being the first to sail from Europe to India by rounding Africa's Cape of Good Hope. Over the course of two voyages, beginning in 1497 and 1502, da Gama landed and traded in locales along the coast of southern Africa before reaching India on May 20, 1498.\n","AREA : 36 km²\n","ELEVATION :  43 m\n","TYPE : Beaches\n","BEST TIME TO VISIT : March to May\n","TOURIST DESTINATION : Velsao Beach, Pilot Beach, Bogmalo Beach\n",R.drawable.vascodagama,"3.7");
        insertGoa(db,"Mapusa","Mapusa is a town in North Goa, India. It is situated 13 km north of the capital Panaji. The town is the headquarters of Bardez Taluka.Mapusa market is especially known for spices, marinated pork sausages, strings of Goan home-made chouriço, cashew nut shops and of course fenny stores. Seedless tamarind, pickles, vegetables, coir mats and ropes are also sold here.\n","AREA : 13 km north of the capital Panaji\n","ELEVATION : 15 m (49 ft)\n","TYPE : Beach, Temple\n","BEST TIME TO VISIT : March to May\n","TOURIST DESTINATION : Kalacha Beach, Chapora Fort, Sri Kalika Temple\n",R.drawable.mapusa,"3.5");
        insertGoa(db,"Calangute","Calangute is a town in the North Goa district of the Indian state of Goa. It is famous for its beach, the largest in North Goa and a popular tourist destination. ... The beach offers water sport activities like parasailing and water skiing, among others.\n","AREA : 11.72 (Ha)\n","ELEVATION : 16.42 m\n","TYPE : Beach, Fort\n","BEST TIME TO VISIT : Decemeber and May\n","TOURIST DESTINATION : Calangute Beach, Baga Beach, Se Cathedral\n",R.drawable.calangute,"4.0");
        insertGoa(db,"Margao","Madgaon or Margao, as it commonly known is the cultural hub and the commercial capital of Goa. The city quietly rests at the banks of River Sal and is known to be one of the oldest settlements in GoaBefore the invasion of the Portuguese Margao was a Matha gram, a land with nine monastic endowments of the Hindus.\n","AREA : 16.1 km²\n","ELEVATION :10 m\n","TYPE : Religious Center, Beaches\n","BEST TIME TO VISIT : February to March\n","TOURIST DESTINATION : Canopy Goa, Monte Hill, Loutolim\n",R.drawable.margao,"4.2");
        insertGoa(db,"Candolim","Candolim promises to be a fun-filled sojourn on your visit to Goa. Located in Bardez Taluka of North Goa, which is a popular tourist attraction, Candolim is a one-stop shop for visitors due to the large number of clubs and parties held here.\n","AREA : Located in the Barduz taluka\n","ELEVATION : 0 cm\n","TYPE : Beaches, Shopping Spots\n","BEST TIME TO VISIT : October and March\n","TOURIST DESTINATION :  Candolim Beach, The Cabo Palace, Coco Beach\n",R.drawable.candolim,"4.5");
        insertGoa(db,"Anjuna","Anjuna was made famous by the ‘flower power and peace’ generation of the sixties and early seventies. And later by the ‘trance’ parties.The beach is known for its breeze-catching palms, soft sand, and the unusual rocky formation overlying a cove of whitish sand. and black rock that juts into the sea.\n","AREA : Located 18 kilometers from Panaji\n","ELEVATION :  5 m\n","TYPE : Beaches\n","BEST TIME TO VISIT : November and March\n","TOURIST DESTINATION : Chapora Fort, Anjuna Beach, Vagator Beach Road, Ozran Beach",R.drawable.anjuna,"4.3");
        insertGoa(db,"Pernem","To step into the golden and blue world of Pernem is to step into paradise. Located in North Goa, and surrounded on all sides by gorgeous beaches, lovely hiking trails, and restaurants, bars and spas galore, Pernem is a great base when you are vacationing in Goa.\n","AREA : 4 km²\n","ELEVATION : 6 m\n","TYPE : Baeches, Lake\n","BEST TIME TO VISIT : t November to March\n","TOURIST DESTINATION : Arambol Beach, Ashvem Beach, Arambol Sweet Water Lake\n",R.drawable.pernem,"4.6");
        insertGoa(db,"Dr. Salim Ali Bird Sanctuary","Salim Ali Bird Sanctuary is an estuarine mangrove habitat, which is declared as the bird sanctuary, and located on western tip of the Island of Chorão along the Mandovi River, Goa, in India\n","AREA :  178 ha\n","ELEVATION : (Area) of 9.07 km2\n","TYPE : Bird Sanctuary\n","BEST TIME TO VISIT : October to December\n","TOURIST DESTINATION : sitors can most probably see white egrets and purple herons, you can expect to see colourful kingfishers, eagles, cormorants, kites, woodpeckers, sandpipers, curlews, drongos and mynahs on a fairly regular basis\n",R.drawable.salim,"3.9");





    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+KERALA);
        db.execSQL("DROP TABLE IF EXISTS "+TAMIL);
        db.execSQL("DROP TABLE IF EXISTS "+RAJASTHAN);
        db.execSQL("DROP TABLE IF EXISTS "+UTTAR);
        db.execSQL("DROP TABLE IF EXISTS "+DELHI);
        db.execSQL("DROP TABLE IF EXISTS "+PUNJAB);
        db.execSQL("DROP TABLE IF EXISTS "+GOA);
        onCreate(db);



    }

    private static void insertKerala(SQLiteDatabase db,String name,String detail,String area,String elevation,String type,String bttv,String dest,int resourceId,String rating) {
        ContentValues keralaValues = new ContentValues();
        keralaValues.put("NAME",name);
        keralaValues.put("DETAIL",detail);
        keralaValues.put("AREA",area);
        keralaValues.put("ELEVATION",elevation);
        keralaValues.put("TYPE",type);
        keralaValues.put("BTTV",bttv);
        keralaValues.put("DEST",dest);
        keralaValues.put("IMAGE_RESOURCE_ID",resourceId);
        keralaValues.put("RATING",rating);
        db.insert("KERALA",null,keralaValues);
    }

    private static void insertTamil(SQLiteDatabase db,String name,String detail,String area,String elevation,String type,String bttv,String dest,int resourceId,String rating) {
        ContentValues tamilValues = new ContentValues();
        tamilValues.put("NAME",name);
        tamilValues.put("DETAIL",detail);
        tamilValues.put("AREA",area);
        tamilValues.put("ELEVATION",elevation);
        tamilValues.put("TYPE",type);
        tamilValues.put("BTTV",bttv);
        tamilValues.put("DEST",dest);
        tamilValues.put("IMAGE_RESOURCE_ID",resourceId);
        tamilValues.put("RATING",rating);
        db.insert("TAMIL",null,tamilValues);
    }

    private static void insertRajasthan(SQLiteDatabase db,String name,String detail,String area,String elevation,String type,String bttv,String dest,int resourceId,String rating) {
        ContentValues rajasthanValues = new ContentValues();
        rajasthanValues.put("NAME",name);
        rajasthanValues.put("DETAIL",detail);
        rajasthanValues.put("AREA",area);
        rajasthanValues.put("ELEVATION",elevation);
        rajasthanValues.put("TYPE",type);
        rajasthanValues.put("BTTV",bttv);
        rajasthanValues.put("DEST",dest);
        rajasthanValues.put("IMAGE_RESOURCE_ID",resourceId);
        rajasthanValues.put("RATING",rating);
        db.insert("RAJASTHAN",null,rajasthanValues);

    }

    private static void insertUttar(SQLiteDatabase db,String name,String detail,String area,String elevation,String type,String bttv,String dest,int resourceId,String rating) {
        ContentValues uttarValues = new ContentValues();
        uttarValues.put("NAME",name);
        uttarValues.put("DETAIL",detail);
        uttarValues.put("AREA",area);
        uttarValues.put("ELEVATION",elevation);
        uttarValues.put("TYPE",type);
        uttarValues.put("BTTV",bttv);
        uttarValues.put("DEST",dest);
        uttarValues.put("IMAGE_RESOURCE_ID",resourceId);
        uttarValues.put("RATING",rating);
        db.insert("UTTAR",null,uttarValues);
    }

    private static void insertDelhi(SQLiteDatabase db,String name,String detail,String area,String height,String type,String bttv,int resourceId,String rating) {
        ContentValues delhiValues = new ContentValues();
        delhiValues.put("NAME",name);
        delhiValues.put("DETAIL",detail);
        delhiValues.put("AREA",area);
        delhiValues.put("HEIGHT",height);
        delhiValues.put("TYPE",type);
        delhiValues.put("BTTV",bttv);
        delhiValues.put("IMAGE_RESOURCE_ID",resourceId);
        delhiValues.put("RATING",rating);
        db.insert("DELHI",null,delhiValues);
    }

    private static void insertPunjab(SQLiteDatabase db,String name,String detail,String area,String elevation,String type,String bttv,String dest,int resourceId,String rating) {
        ContentValues punjabValues = new ContentValues();
        punjabValues.put("NAME",name);
        punjabValues.put("DETAIL",detail);
        punjabValues.put("AREA",area);
        punjabValues.put("ELEVATION",elevation);
        punjabValues.put("TYPE",type);
        punjabValues.put("BTTV",bttv);
        punjabValues.put("DEST",dest);
        punjabValues.put("IMAGE_RESOURCE_ID",resourceId);
        punjabValues.put("RATING",rating);
        db.insert("PUNJAB",null,punjabValues);
    }

    private static void insertGoa(SQLiteDatabase db,String name,String detail,String area,String elevation,String type,String bttv,String dest,int resourceId,String rating) {
        ContentValues goaValues = new ContentValues();
        goaValues.put("NAME",name);
        goaValues.put("DETAIL",detail);
        goaValues.put("AREA",area);
        goaValues.put("ELEVATION",elevation);
        goaValues.put("TYPE",type);
        goaValues.put("BTTV",bttv);
        goaValues.put("DEST",dest);
        goaValues.put("IMAGE_RESOURCE_ID",resourceId);
        goaValues.put("RATING",rating);
        db.insert("GOA",null,goaValues);
    }
}

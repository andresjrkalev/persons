package ee.persons.common;

public class Constants {
    public static final String ENDPOINT_PERSON = "/person";

    public static final String[] FIRSTNAMES = {
        "Aleksander","Hirvo","Raul","Märt","Priidu","Kaido","Edgar","Luukas","Ivo","Timo","Eedu","Meelis","Janek","Taivo","Roland","Eerik","Toivo","Aleks","Kaarel","Joonas","Haljand","Ruuben","Mark","Matteus","Ando","Vahur","Veljo","Mario","Voldemar","Tiit","Leevi","Endel","Jass","Evald","Raigo","Algo","Kristian","Kauri","Andreas","Viljar","Valdur","Maarjo","Paulus","Sulev","Valdeko","Tiidrik","Vaino","Ruut","Roomet","Jaagup","Uku","Jukk","Verner","Ülo","Volli","Riivo","Tauno","Loit","Innar","Artur","Aavo","Hendrik","Erik","Eston","Allan","Enn","Lauri","Ivar","Mehis","Enno","Kunnar","Jaakob","Reigo","Henri","Jasper","Olavi","Maanus","Eimar","Toomas","Rain","Ott","Aadu","Peedu","Elmar","Alvar","Väino","Eldur","Tõnis","Olari","Ahti","Eedo","Ado","Arvi","Tarvo","Eero","Hillar","Meeme","Uudo","Miikael","Harri","Asko","Margus","August","Indrek","Einar","Aare","Hans","Hardi","Arved","Tauri","Hando","Ralf","Esko","Aarne","Anton","Tarvi","Maido","Kaur","Siim","Alo","Anti","Andres","Mihkel","Imre","Neeme","Vambola","Rainer","Raimo","Ivari","Agu","Mattias","Lenno","Timmo","Kusta","Joona","Ago","Marek","Elias","Vello","Tanel","Aadam","Villu","Eduard","Magnus","Valev","Johannes","Markus","Mait","Rudolf","Robin","Ahto","Arvid","Ergo","Hannes","Tõnu","Heiti","Kustav","Alar","Kaspar","Elmo","Alari","Kalmer","Hanno","Hindrek","Valmo","Ilmar","Siimon","Rando","Ants","Aado","Otto","Marti","Rene","Aigar","Villem","Aksel","Udo","Uno","Jaak","Jüri","Aapo","Niilo","Vambo","Ruudi","Raimond","Raido","Nigul","Linnart","Paavo","Sven","Kuno","Madis","Viljo","Riho","Aivo","Janar","Kalev","Andre","Taimar","Kristo","Kustas","Ilmo","Jaan","Ardo","Raivo","Tambet","Bruno","Evert","Priidik","Oliver","Ranno","Egert","Kevin","Juho","Rein","Valter","Olev","Keerdo","Arnold","Ardi","Rauno","Henn","Uuno","Roman","Margo","Erki","Joakim","Aivar","Tuudor","Jakob","Sander","Georg","Ãœllar","Juhan","Madi","Aaron","Illar","Oskar","Valmar","Leemet","Lennart","Gert","Aabel","Vootele","Endrik","Peetrus","Allar","Risto","Taaniel","Vidrik","Karl","Taimo","Heino","Kardo","PÃ¤Ã¤ro","Kalju","Kermo","Kaupo","Robi","Erko","Urmo","Rait","Joel","Gunnar","Siimeon","Vallo","Gustav","Valdo","Ülari","Kristen","Albert","Erlend","Rasmus","Pääru","Raiko","Peep","Jaanus","Arti","Emil","Reio","Juss","Sten","Laur","Peet","Nuut","Aabraham","Kaimar","Robert","TÃµnn","Mikk","Hugo","Pearu","Illimar","Mati","Janno","Veiko","PÃ¤Ã¤ren","Joosep","Taavi","Kaljo","Peeter","Priit","Timmu","Valentin","Paul","Joonatan","Taavo","Viktor","Ragnar","Eino","Nigulas","Mairo","Tiitus","Kristofer","Kalle","Andrus","Ermo","Tarmo","Urmet","Egon","Argo","Urmas","Heigo","Arno","Tormi","Iisak","Linnar","Romet","Nils","Martin","Leho","Taavet","Silver","Arvo","Ain","Lembit","Kert","Osvald","Feliks","Armin","Rihard","Vaiko","Kuldar","Richard","Kajar","Saamuel","Heiki","Ken","Jürgen","Marko","Marten","Iivo","Reedik","Teet","Kristjan","Ville","Koit",
        "Ilona","Iiris","Magdaleena","Esme","Helgi","Klaudia","Lehte","Reelika","Valli","Silvi","Raahel","Kreet","Aale","Gerli","Leena","Marju","Helen","Terje","Saara","Liis","Agnes","Asta","Valda","Aune","Anu","Jaanika","Eeva","Kristin","Aurelia","Kiira","Nele","Kirsi","Anete","Pilvi","Maire","Raili","Merit","Naima","Katriin","Aime","Liisbet","Liide","Marve","Gerda","Sabiine","Agne","Hanna","Auli","Krista","Regina","Marje","Vaike","Ulrika","Nelli","Sohvi","Salme","Dagmar","Teele","Roosi","Lii","Eliisabet","Astrid","Kertu","Veronika","Sirje","Kätlin","Maie","Angelika","Hele","Doora","Mirjam","Luule","Moonika","Olga","Helbe","Kairi","Ellen","Vilma","Alina","Ainu","Malle","Külli","Kristel","Leelo","Ave","Katre","Rahel","Reili","Karolin","Reeli","Doris","Loviise","Saima","Evi","Age","Marta","Epp","Maila","Eda","Pille","Ilse","Susanna","Karoliine","Lea","Berta","Helene","Viivi","Ann","Reet","Helju","Inna","Ester","Leili","Vilvi","Linda","Aliise","Meeta","Maris","Heleene","Kaia","Maret","Elle","Brita","Irene","Kaili","Kristen","Sirli","Olivia","Rita","Piia","Piret","Mariliis","Karina","Koidu","Karoliina","Sanna","Monika","Loore","Eevi","Kaisa","Elina","Haide","Aile","Taimi","Minna","Evelin","Milli","Katariina","Ruut","Kiiri","Madli","Nella","Leida","Kadi","Aire","Silja","Laine","Meeli","Berit","Vilja","Ita","Marit","Pirje","Egle","Maimu","Olli","Liina","Katrin","Loone","Ivi","Ilmi","Karmen","Kaja","Lilian","Eve","Urve","Helle","Selma","Kati","Ingrid","Eili","Katri","Piibe","Ursula","Riinu","Elo","Maiken","Inga","Mari-Liis","Rebeka","Adeele","Eha","Jane","Viiu","Urvi","Getter","Heili","Liilia","Aada","Maria","Birgit","Grete","Maarja","Tuulike","Signe","Elvi","Eva","Heli","Aasa","Endla","Margareeta","Lagle","Hilda","Diana","Sandra","Lilli","Annika","Janne","Merili","Ulvi","Meelike","Maia","Viive","Kirke","Maarika","Luise","Heleri","Riina","Helmi","Elma","Siiri","Säde","Merilin","Aliide","Kristina","Eneken","Kaarin","Elisabet","Liia","Tea","Triin","Marge","Helga","Milla","Ines","Tiia","Jana","Marika","Iris","Ingel","Heljo","Talvi","Sigrid","Liivika","Ivika","Aet","Elis","Ragne","Agaate","Siret","Kaie","Anna","Margaret","Andra","Aleksandra","Herta","Ruth","Esta","Kaidi","Hiie","Hedi","Aade","Ebe","Anne","Hille","Ehala","Aive","Regiina","Kristiina","Virve","Kristi","Tiiu","Tuuli","Kerstin","Jaana","Laura","Kelli","Made","Tuule","Anneli","Aili","Liisi","Lembi","Milja","Inge","Liidia","Ulla","Kersti","Mare","Virge","Helve","Keiu","Eliise","Kai","Helena","Krõõt","Imbi","Angela","Karin","Viivika","Viia","Riin","Naimi","Marina","Rutt","Valve","Kerli","Miina","Ellinor","Meta","Emilie","Eneli","Anni","Heidi","Mai","Helina","Miia","Hilja","Kärt","Merle","Airi","Miili","Ille","Erika","Emma","Neidi","Merike","Irma","Meelika","Silvia","Ene","Kreeta","Aino","KÃ¼llike","Liisa","Aita","Tiina","Margot","Sireli","Johanna","Lehti","Marleen","Merje","Kadri","Leegi","Renate","Greete","Eliisa","Ilme","Liivi","Juta","Irja","Lemme","Triinu","Margit","Halliki","Gita","Ere","Mari","Paula"
    };

    public static final String[] LASTNAMES = {
        "Tamm",
        "Saar",
        "Sepp",
        "Kask",
        "Kukk",
        "Ilves",
        "Rebane",
        "Oja",
        "Koppel",
        "Luik"
    };

    public static final int LIMIT_PERSON = 10;

    public static final int MAX_PERSONS = 100000;

    public static final String PATTERN_CORS = "/**";
    public static final String PATTERN_QUERY_LIKE = "%%%s%%";

    public static final String PROPERTY_FIRSTNAME = "firstname";
    public static final String PROPERTY_LASTNAME = "lastname";
    public static final String PROPERTY_PERSONAL_CODE = "personalCode";

    public static final String SYMBOL_ASTERISK = "*";

    public static final String QUERY_PARAMETER_PERSONAL_CODE = "personal_code";
}

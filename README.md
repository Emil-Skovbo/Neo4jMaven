## Assignment 4 - Neo4j Cluster Application

We have the 3 servers in a cluster, but is is on localhost. The queries running from the java client prints:

query1: returns all nodes id[Record<{n: node<0>}>, Record<{n: node<1>}>, Record<{n: node<2>}>, Record<{n: node<3>}>, Record<{n: node<4>}>, Record<{n: node<5>}>, Record<{n: node<6>}>, Record<{n: node<7>}>, Record<{n: node<8>}>, Record<{n: node<9>}>, Record<{n: node<10>}>, Record<{n: node<11>}>, Record<{n: node<12>}>, Record<{n: node<13>}>, Record<{n: node<14>}>, Record<{n: node<15>}>, Record<{n: node<16>}>, Record<{n: node<17>}>, Record<{n: node<18>}>, Record<{n: node<19>}>, Record<{n: node<20>}>, Record<{n: node<21>}>, Record<{n: node<22>}>, Record<{n: node<23>}>, Record<{n: node<24>}>, Record<{n: node<25>}>, Record<{n: node<26>}>, Record<{n: node<27>}>, Record<{n: node<28>}>, Record<{n: node<29>}>, Record<{n: node<30>}>, Record<{n: node<31>}>, Record<{n: node<32>}>, Record<{n: node<33>}>, Record<{n: node<34>}>, Record<{n: node<35>}>, Record<{n: node<36>}>, Record<{n: node<37>}>, Record<{n: node<38>}>, Record<{n: node<39>}>, Record<{n: node<40>}>, Record<{n: node<41>}>, Record<{n: node<42>}>, Record<{n: node<43>}>, Record<{n: node<44>}>, Record<{n: node<45>}>, Record<{n: node<46>}>, Record<{n: node<47>}>, Record<{n: node<48>}>, Record<{n: node<49>}>, Record<{n: node<50>}>, Record<{n: node<51>}>, Record<{n: node<52>}>, Record<{n: node<53>}>, Record<{n: node<54>}>, Record<{n: node<55>}>, Record<{n: node<56>}>, Record<{n: node<57>}>, Record<{n: node<58>}>, Record<{n: node<59>}>, Record<{n: node<60>}>, Record<{n: node<61>}>, Record<{n: node<62>}>, Record<{n: node<63>}>, Record<{n: node<64>}>, Record<{n: node<65>}>, Record<{n: node<66>}>, Record<{n: node<67>}>, Record<{n: node<68>}>, Record<{n: node<69>}>, Record<{n: node<70>}>, Record<{n: node<71>}>, Record<{n: node<72>}>, Record<{n: node<73>}>, Record<{n: node<74>}>, Record<{n: node<75>}>, Record<{n: node<76>}>, Record<{n: node<77>}>, Record<{n: node<78>}>, Record<{n: node<79>}>, Record<{n: node<80>}>, Record<{n: node<81>}>, Record<{n: node<82>}>, Record<{n: node<83>}>, Record<{n: node<84>}>, Record<{n: node<85>}>, Record<{n: node<86>}>, Record<{n: node<87>}>, Record<{n: node<88>}>, Record<{n: node<89>}>, Record<{n: node<90>}>, Record<{n: node<91>}>, Record<{n: node<92>}>, Record<{n: node<93>}>, Record<{n: node<94>}>, Record<{n: node<95>}>, Record<{n: node<96>}>, Record<{n: node<97>}>, Record<{n: node<98>}>, Record<{n: node<99>}>, Record<{n: node<100>}>, Record<{n: node<101>}>, Record<{n: node<102>}>, Record<{n: node<103>}>, Record<{n: node<104>}>, Record<{n: node<105>}>, Record<{n: node<106>}>, Record<{n: node<107>}>, Record<{n: node<108>}>, Record<{n: node<109>}>, Record<{n: node<110>}>, Record<{n: node<111>}>, Record<{n: node<112>}>, Record<{n: node<113>}>, Record<{n: node<114>}>, Record<{n: node<115>}>, Record<{n: node<116>}>, Record<{n: node<117>}>, Record<{n: node<118>}>, Record<{n: node<119>}>, Record<{n: node<120>}>, Record<{n: node<121>}>, Record<{n: node<122>}>, Record<{n: node<123>}>, Record<{n: node<124>}>, Record<{n: node<125>}>, Record<{n: node<126>}>, Record<{n: node<127>}>, Record<{n: node<128>}>, Record<{n: node<129>}>, Record<{n: node<130>}>, Record<{n: node<131>}>, Record<{n: node<132>}>, Record<{n: node<133>}>, Record<{n: node<134>}>, Record<{n: node<135>}>, Record<{n: node<136>}>, Record<{n: node<137>}>, Record<{n: node<138>}>, Record<{n: node<139>}>, Record<{n: node<140>}>, Record<{n: node<141>}>, Record<{n: node<142>}>, Record<{n: node<143>}>, Record<{n: node<144>}>, Record<{n: node<145>}>, Record<{n: node<146>}>, Record<{n: node<147>}>, Record<{n: node<148>}>, Record<{n: node<149>}>, Record<{n: node<150>}>, Record<{n: node<151>}>, Record<{n: node<152>}>, Record<{n: node<153>}>, Record<{n: node<154>}>, Record<{n: node<155>}>, Record<{n: node<156>}>, Record<{n: node<157>}>, Record<{n: node<158>}>, Record<{n: node<159>}>, Record<{n: node<160>}>, Record<{n: node<161>}>, Record<{n: node<162>}>, Record<{n: node<163>}>, Record<{n: node<164>}>, Record<{n: node<165>}>, Record<{n: node<166>}>, Record<{n: node<167>}>, Record<{n: node<168>}>, Record<{n: node<169>}>, Record<{n: node<170>}>, Record<{n: node<171>}>, Record<{n: node<172>}>, Record<{n: node<173>}>, Record<{n: node<174>}>, Record<{n: node<175>}>, Record<{n: node<176>}>, Record<{n: node<177>}>, Record<{n: node<178>}>, Record<{n: node<179>}>, Record<{n: node<180>}>, Record<{n: node<181>}>, Record<{n: node<182>}>, Record<{n: node<183>}>, Record<{n: node<184>}>, Record<{n: node<185>}>]

query2: returns all nodes names[Record<{n.name: NULL}>, Record<{n.name: "Keanu Reeves"}>, Record<{n.name: "Carrie-Anne Moss"}>, Record<{n.name: "Laurence Fishburne"}>, Record<{n.name: "Hugo Weaving"}>, Record<{n.name: "Andy Wachowski"}>, Record<{n.name: "Lana Wachowski"}>, Record<{n.name: "Joel Silver"}>, Record<{n.name: "Emil Eifrem"}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: "Charlize Theron"}>, Record<{n.name: "Al Pacino"}>, Record<{n.name: "Taylor Hackford"}>, Record<{n.name: NULL}>, Record<{n.name: "Tom Cruise"}>, Record<{n.name: "Jack Nicholson"}>, Record<{n.name: "Demi Moore"}>, Record<{n.name: "Kevin Bacon"}>, Record<{n.name: "Kiefer Sutherland"}>, Record<{n.name: "Noah Wyle"}>, Record<{n.name: "Cuba Gooding Jr."}>, Record<{n.name: "Kevin Pollak"}>, Record<{n.name: "J.T. Walsh"}>, Record<{n.name: "James Marshall"}>, Record<{n.name: "Christopher Guest"}>, Record<{n.name: "Rob Reiner"}>, Record<{n.name: "Aaron Sorkin"}>, Record<{n.name: NULL}>, Record<{n.name: "Kelly McGillis"}>, Record<{n.name: "Val Kilmer"}>, Record<{n.name: "Anthony Edwards"}>, Record<{n.name: "Tom Skerritt"}>, Record<{n.name: "Meg Ryan"}>, Record<{n.name: "Tony Scott"}>, Record<{n.name: "Jim Cash"}>, Record<{n.name: NULL}>, Record<{n.name: "Renee Zellweger"}>, Record<{n.name: "Kelly Preston"}>, Record<{n.name: "Jerry O'Connell"}>, Record<{n.name: "Jay Mohr"}>, Record<{n.name: "Bonnie Hunt"}>, Record<{n.name: "Regina King"}>, Record<{n.name: "Jonathan Lipnicki"}>, Record<{n.name: "Cameron Crowe"}>, Record<{n.name: NULL}>, Record<{n.name: "River Phoenix"}>, Record<{n.name: "Corey Feldman"}>, Record<{n.name: "Wil Wheaton"}>, Record<{n.name: "John Cusack"}>, Record<{n.name: "Marshall Bell"}>, Record<{n.name: NULL}>, Record<{n.name: "Helen Hunt"}>, Record<{n.name: "Greg Kinnear"}>, Record<{n.name: "James L. Brooks"}>, Record<{n.name: NULL}>, Record<{n.name: "Annabella Sciorra"}>, Record<{n.name: "Max von Sydow"}>, Record<{n.name: "Werner Herzog"}>, Record<{n.name: "Robin Williams"}>, Record<{n.name: "Vincent Ward"}>, Record<{n.name: NULL}>, Record<{n.name: "Ethan Hawke"}>, Record<{n.name: "Rick Yune"}>, Record<{n.name: "James Cromwell"}>, Record<{n.name: "Scott Hicks"}>, Record<{n.name: NULL}>, Record<{n.name: "Parker Posey"}>, Record<{n.name: "Dave Chappelle"}>, Record<{n.name: "Steve Zahn"}>, Record<{n.name: "Tom Hanks"}>, Record<{n.name: "Nora Ephron"}>, Record<{n.name: NULL}>, Record<{n.name: "Rita Wilson"}>, Record<{n.name: "Bill Pullman"}>, Record<{n.name: "Victor Garber"}>, Record<{n.name: "Rosie O'Donnell"}>, Record<{n.name: NULL}>, Record<{n.name: "John Patrick Stanley"}>, Record<{n.name: "Nathan Lane"}>, Record<{n.name: NULL}>, Record<{n.name: "Billy Crystal"}>, Record<{n.name: "Carrie Fisher"}>, Record<{n.name: "Bruno Kirby"}>, Record<{n.name: NULL}>, Record<{n.name: "Liv Tyler"}>, Record<{n.name: NULL}>, Record<{n.name: "Brooke Langton"}>, Record<{n.name: "Gene Hackman"}>, Record<{n.name: "Orlando Jones"}>, Record<{n.name: "Howard Deutch"}>, Record<{n.name: NULL}>, Record<{n.name: "Christian Bale"}>, Record<{n.name: "Zach Grenier"}>, Record<{n.name: NULL}>, Record<{n.name: "Mike Nichols"}>, Record<{n.name: NULL}>, Record<{n.name: "Richard Harris"}>, Record<{n.name: "Clint Eastwood"}>, Record<{n.name: NULL}>, Record<{n.name: "Takeshi Kitano"}>, Record<{n.name: "Dina Meyer"}>, Record<{n.name: "Ice-T"}>, Record<{n.name: "Robert Longo"}>, Record<{n.name: NULL}>, Record<{n.name: "Halle Berry"}>, Record<{n.name: "Jim Broadbent"}>, Record<{n.name: "Tom Tykwer"}>, Record<{n.name: NULL}>, Record<{n.name: "Ian McKellen"}>, Record<{n.name: "Audrey Tautou"}>, Record<{n.name: "Paul Bettany"}>, Record<{n.name: "Ron Howard"}>, Record<{n.name: NULL}>, Record<{n.name: "Natalie Portman"}>, Record<{n.name: "Stephen Rea"}>, Record<{n.name: "John Hurt"}>, Record<{n.name: "Ben Miles"}>, Record<{n.name: NULL}>, Record<{n.name: "Emile Hirsch"}>, Record<{n.name: "John Goodman"}>, Record<{n.name: "Susan Sarandon"}>, Record<{n.name: "Matthew Fox"}>, Record<{n.name: "Christina Ricci"}>, Record<{n.name: "Rain"}>, Record<{n.name: NULL}>, Record<{n.name: "Naomie Harris"}>, Record<{n.name: NULL}>, Record<{n.name: "Michael Clarke Duncan"}>, Record<{n.name: "David Morse"}>, Record<{n.name: "Sam Rockwell"}>, Record<{n.name: "Gary Sinise"}>, Record<{n.name: "Patricia Clarkson"}>, Record<{n.name: "Frank Darabont"}>, Record<{n.name: NULL}>, Record<{n.name: "Frank Langella"}>, Record<{n.name: "Michael Sheen"}>, Record<{n.name: "Oliver Platt"}>, Record<{n.name: NULL}>, Record<{n.name: "Danny DeVito"}>, Record<{n.name: "John C. Reilly"}>, Record<{n.name: NULL}>, Record<{n.name: "Ed Harris"}>, Record<{n.name: "Bill Paxton"}>, Record<{n.name: NULL}>, Record<{n.name: "Philip Seymour Hoffman"}>, Record<{n.name: "Jan de Bont"}>, Record<{n.name: NULL}>, Record<{n.name: "Robert Zemeckis"}>, Record<{n.name: NULL}>, Record<{n.name: "Milos Forman"}>, Record<{n.name: NULL}>, Record<{n.name: "Diane Keaton"}>, Record<{n.name: "Nancy Meyers"}>, Record<{n.name: NULL}>, Record<{n.name: "Chris Columbus"}>, Record<{n.name: NULL}>, Record<{n.name: "Julia Roberts"}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: "Madonna"}>, Record<{n.name: "Geena Davis"}>, Record<{n.name: "Lori Petty"}>, Record<{n.name: "Penny Marshall"}>, Record<{n.name: "Paul Blythe"}>, Record<{n.name: "Angela Scope"}>, Record<{n.name: "Jessica Thompson"}>, Record<{n.name: "James Thompson"}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: "Andy"}>, Record<{n.name: "Buzz Lightyear"}>, Record<{n.name: "Woody"}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: "Foody"}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: NULL}>, Record<{n.name: "Moody"}>, Record<{n.name: NULL}>]

query3: returns what Mike Nichols have Directed[Record<{ee: node<96>, star: node<157>}>, Record<{ee: node<96>, star: node<95>}>]

query4: returns Top Gun actors and the role they played in the movie[Record<{n.title: "Top Gun", a.roles: ["Iceman"], f.name: "Val Kilmer"}>, Record<{n.title: "Top Gun", a.roles: ["Carole"], f.name: "Meg Ryan"}>, Record<{n.title: "Top Gun", a.roles: ["Viper"], f.name: "Tom Skerritt"}>, Record<{n.title: "Top Gun", a.roles: ["Charlie"], f.name: "Kelly McGillis"}>, Record<{n.title: "Top Gun", a.roles: ["Maverick"], f.name: "Tom Cruise"}>, Record<{n.title: "Top Gun", a.roles: ["Goose"], f.name: "Anthony Edwards"}>]

query5: returns Keanu Reeves because he is breathtaking[Record<{n.name: "Keanu Reeves"}>] 

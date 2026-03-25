package proyectoProgII;

import gui.Display;

public class Main {
	
	private static ColaMa M;
	private static LDobleF F;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Lista de Compras de los clientes
		
		LSimpleCo Co= new LSimpleCo();
		Co.adicionar(new Plato("Sopa Wanton","Chang2", 20));
		Co.adicionar(new Plato("Tallarines salteados","Chang3", 25));
		Co.adicionar(new Plato("Mapo Tofu","Chang4", 25));
		
		LSimpleCo Co1= new LSimpleCo();
		Co1.adicionar(new Plato("Pizza de peperoni","Vend1", 30));
		Co1.adicionar(new Plato("Pizza Hawaiana","Vend2", 20));
		Co1.adicionar(new Plato("Pizza carnivora","Vend3", 25));
		
		LSimpleCo Co2= new LSimpleCo();
		Co2.adicionar(new Plato("Chuleton","Carn1", 30));
		Co2.adicionar(new Plato("Costillas de cerdo","Carn2", 20));
		
		LSimpleCo Co3= new LSimpleCo();
		Co3.adicionar(new Plato("Sushi de salmon","Sam1", 30));
		Co3.adicionar(new Plato("Sushi de atun","Sam2", 20));
		
		LSimpleCo Co4= new LSimpleCo();
		Co4.adicionar(new Plato("Spaguetti a la carbonara","Tut1", 30));
		
		LSimpleCo Co5= new LSimpleCo();
		Co5.adicionar(new Plato("Pique macho","Sab1", 40));
		
		// Lista de los Clientes que compraron un restaurante
		
		LSimpleCl Cl= new LSimpleCl();
		Cl.adicionar(new Cliente("Juan", "Perez", 4790063), Co);
		Cl.adicionar(new Cliente("Gabriela", "Vargas", 8473994), Co1);
		
		LSimpleCl Cl2= new LSimpleCl();
		Cl2.adicionar(new Cliente("Maria", "Gutierrez", 9743082), Co);
		Cl2.adicionar(new Cliente("Luis", "Fernandez", 4529472), Co1);

		LSimpleCl Cl3= new LSimpleCl();
		Cl3.adicionar(new Cliente("Pedro", "Mamani", 893572), Co2);
		
		LSimpleCl Cl4= new LSimpleCl();
		Cl4.adicionar(new Cliente("Andres ", "Mujica", 7895655), Co3);
		
		LSimpleCl Cl5= new LSimpleCl();
		Cl5.adicionar(new Cliente("Luis", "Fernandez", 832783), Co4);
		Cl5.adicionar(new Cliente("Jose", "Camacho", 348600), Co5);
		
		LSimpleCl Cl6= new LSimpleCl();
		
		LSimpleCl Cl7= new LSimpleCl();
		
		LSimpleCl Cl8= new LSimpleCl();
		
		LSimpleCl Cl9= new LSimpleCl();
		
		LSimpleCl Cl10= new LSimpleCl();
		
		LSimpleCl Cl11= new LSimpleCl();
		
		LSimpleCl Cl12= new LSimpleCl();
		
		LSimpleCl Cl13= new LSimpleCl();
		
		LSimpleCl Cl14= new LSimpleCl();
		
		LSimpleCl Cl15= new LSimpleCl();
		
		LSimpleCl Cl16= new LSimpleCl();
		
		LSimpleCl Cl17= new LSimpleCl();
		
		LSimpleCl Cl18= new LSimpleCl();
		
		LSimpleCl Cl19= new LSimpleCl();
		
		LSimpleCl Cl20= new LSimpleCl();
		
		LSimpleCl Cl21= new LSimpleCl();
		
		LSimpleCl Cl22= new LSimpleCl();
		
		
		
		// Menues
		
		CCircularM Me = new CCircularM();
		Me.adicionar(new Plato("Carne picada con verduras","Chang1", 30));
		Me.adicionar(new Plato("Sopa Wanton","Chang2", 20));
		Me.adicionar(new Plato("Tallarines salteados","Chang3", 25));
		Me.adicionar(new Plato("Mapo Tofu","Chang4", 25));
		Me.adicionar(new Plato("Pollo agridulce","Chang5", 25));
		Me.adicionar(new Plato("Pato laqueado","Chang6", 40));
		
		CCircularM Me2 = new CCircularM();
		Me2.adicionar(new Plato("Pizza de peperoni","Vend1", 30));
		Me2.adicionar(new Plato("Pizza Hawaiana","Vend2", 20));
		Me2.adicionar(new Plato("Pizza carnivora","Vend3", 25));
		Me2.adicionar(new Plato("Pizza de pollo","Vend4", 25));
		Me2.adicionar(new Plato("Pizza de champiñones","Vend5", 25));
		Me2.adicionar(new Plato("Pizza de jamon","Vend6", 40));
		Me2.adicionar(new Plato("Pizza de aceitunas","Vend7", 40));
		Me2.adicionar(new Plato("Pizza 4 quesos","Vend8", 40));
		Me2.adicionar(new Plato("Pizza de mariscos","Vend9", 40));
		
		CCircularM Me3 = new CCircularM();
		Me3.adicionar(new Plato("Chuleton","Carn1", 30));
		Me3.adicionar(new Plato("Costillas de cerdo","Carn2", 20));
		Me3.adicionar(new Plato("Chuletas de cordero","Carn3", 25));
		Me3.adicionar(new Plato("Chuletas de cerdo","Carn4", 35));
		Me3.adicionar(new Plato("Bife de chorizo","Carn5", 35));
		Me3.adicionar(new Plato("Picaña","Carn6", 35));
		Me3.adicionar(new Plato("Tomahawk","Carn7", 40));
		
		CCircularM Me4 = new CCircularM();
		Me4.adicionar(new Plato("Sushi de salmon","Sam1", 30));
		Me4.adicionar(new Plato("Sushi de atun","Sam2", 20));
		Me4.adicionar(new Plato("Ramen Shio","Sam3", 35));
		Me4.adicionar(new Plato("Ramen Miso","Sam4", 35));
		Me4.adicionar(new Plato("Ramen Shoyu","Sam5", 35));
		Me4.adicionar(new Plato("Sushi de langostinos","Sam6", 40));
		Me4.adicionar(new Plato("Sushi de pulpo","Sam7", 40));
		Me4.adicionar(new Plato("Sushi de calamar","Sam8", 40));
		
		CCircularM Me5 = new CCircularM();
		Me5.adicionar(new Plato("Spaguetti a la carbonara","Tut1", 30));
		Me5.adicionar(new Plato("Spaguetti a la bolognesa","Tut2", 20));
		Me5.adicionar(new Plato("Spaguetti a la marinera","Tut3", 25));
		Me5.adicionar(new Plato("Lasagna","Tut4", 35));
		Me5.adicionar(new Plato("Raviolis","Tut5", 35));
		Me5.adicionar(new Plato("Canelones","Tut6", 35));
		Me5.adicionar(new Plato("Fettuccine Alfredo","Tut7", 40));
		
		CCircularM Me6 = new CCircularM();
		Me6.adicionar(new Plato("Pique macho","Sab1", 40));
		Me6.adicionar(new Plato("Silpancho","Sab2", 30));
		Me6.adicionar(new Plato("Fricase","Sab3", 35));
		Me6.adicionar(new Plato("Chicharron","Sab4", 35));
		Me6.adicionar(new Plato("Majadito","Sab5", 30));
		Me6.adicionar(new Plato("Chairo", "Sab6", 20));
		Me6.adicionar(new Plato("Sopa de mani","Sab7", 20));
		
		CCircularM Me7 = new CCircularM();
		Me7.adicionar(new Plato("Hamburguesa simple","Gol1", 20));
		Me7.adicionar(new Plato("Hamburguesa doble","Gol2", 30));
		Me7.adicionar(new Plato("Hamburguesa triple","Gol3", 35));
		Me7.adicionar(new Plato("Hamburguesa strogonof","Gol4", 35));
		Me7.adicionar(new Plato("Hamburguesa a la BBQ huevo","Gol5", 30));
		Me7.adicionar(new Plato("Hamburguesa a America","Gol6", 30));
		Me7.adicionar(new Plato("Hamburguesa TexMex","Gol7", 30));
		Me7.adicionar(new Plato("Hamburguesa de pollo","Gol8", 25));
		
		CCircularM Me8 = new CCircularM();
		Me8.adicionar(new Plato("Ramen Shio","Nar1", 35));
		Me8.adicionar(new Plato("Ramen Miso","Nar2", 35));
		Me8.adicionar(new Plato("Ramen Shoyu","Nar3", 35));
		Me8.adicionar(new Plato("Ramen de mariscos","Nar4", 40));
		Me8.adicionar(new Plato("Ramen de pollo","Nar5", 35));
		Me8.adicionar(new Plato("Ramen de carne","Nar6", 35));
		Me8.adicionar(new Plato("Ramen de verduras","Nar7", 30));
		Me8.adicionar(new Plato("Ramen de huevo","Nar8", 30));
		Me8.adicionar(new Plato("Ramen de tofu","Nar9", 30));
		
		CCircularM Me9 = new CCircularM();
		Me9.adicionar(new Plato("6 Alitas BBQ","Fas1", 20));
		Me9.adicionar(new Plato("6 Alitas picantes","Fas2", 20));
		Me9.adicionar(new Plato("12 Alitas BBQ","Fas3", 37));
		Me9.adicionar(new Plato("12 Alitas picantes","Fas4", 37));
		Me9.adicionar(new Plato("24 Alitas BBQ","Fas5", 60));
		Me9.adicionar(new Plato("24 Alitas picantes","Fas5", 60));;
		Me9.adicionar(new Plato("50 Alitas BBQ","Fas6", 100));
		Me9.adicionar(new Plato("50 Alitas picantes","Fas7", 100));
		
		CCircularM Me10 = new CCircularM();
		Me10.adicionar(new Plato("Spaguetti a la carbonara","Ita1", 30));
		Me10.adicionar(new Plato("Spaguetti a la bolognesa","Ita2", 20));
		Me10.adicionar(new Plato("Spaguetti a la marinera","Ita3", 25));
		Me10.adicionar(new Plato("Lasagna","Ita4", 35));
		Me10.adicionar(new Plato("Raviolis","Ita5", 35));
		Me10.adicionar(new Plato("Canelones","Ita6", 35));
		Me10.adicionar(new Plato("Fettuccine Alfredo","Ita7", 40));
		Me10.adicionar(new Plato("Spaguetti a la carbonara","Ita8", 30));
		
		CCircularM Me11 = new CCircularM();
		Me11.adicionar(new Plato("Milanesa de pollo","Mil1", 20));
		Me11.adicionar(new Plato("Milanesa de res","Mil2", 25));
		Me11.adicionar(new Plato("Milanesa de cerdo","Mil3", 30));
		Me11.adicionar(new Plato("Milanesa Napolitana","Mil4", 40));
		Me11.adicionar(new Plato("Milanesa a la suiza","Mil5", 40));
		Me11.adicionar(new Plato("Milanesa a la parmesana","Mil6", 40));
		Me11.adicionar(new Plato("Milanesa a la romana","Mil7", 40));
		Me11.adicionar(new Plato("Milanesa a la criolla","Mil8", 40));
		
		CCircularM Me12 = new CCircularM();
		Me12.adicionar(new Plato("Hamburguesa simple","Pio1", 20));
		Me12.adicionar(new Plato("Hamburguesa doble","Pio2", 30));
		Me12.adicionar(new Plato("Papas fritas","Pio3", 10));
		Me12.adicionar(new Plato("Cuarto de pollo","Pio4", 35));
		Me12.adicionar(new Plato("Balde 8 presas","Pio5", 80));
		Me12.adicionar(new Plato("Balde 12 presas","Pio6", 100));
		
		CCircularM Me13 = new CCircularM();
		Me13.adicionar(new Plato("Spaguetti a la carbonara","Ilf1", 30));
		Me13.adicionar(new Plato("Spaguetti a la bolognesa","Ilf2", 20));
		Me13.adicionar(new Plato("Spaguetti a la marinera","Ilf3", 25));
		Me13.adicionar(new Plato("Lasagna","Ilf4", 35));
		Me13.adicionar(new Plato("Raviolis","Ilf5", 35));
		Me13.adicionar(new Plato("Canelones","Ilf6", 35));
		Me13.adicionar(new Plato("Fettuccine Alfredo","Ilf7", 40));
		Me13.adicionar(new Plato("Lasagna vegetariana","Ilf8", 30));
		
		CCircularM Me14 = new CCircularM();
		Me14.adicionar(new Plato("Pizza de peperoni","Piz1", 30));
		Me14.adicionar(new Plato("Pizza Hawaiana","Piz2", 20));
		Me14.adicionar(new Plato("Pizza carnivora","Piz3", 25));
		Me14.adicionar(new Plato("Pizza de pollo","Piz4", 25));
		Me14.adicionar(new Plato("Pizza de champiñones","Piz5", 25));
		Me14.adicionar(new Plato("Pizza de jamon","Piz6", 40));
		
		CCircularM Me15 = new CCircularM();
		Me15.adicionar(new Plato("Arroz chaufa","Chif1", 30));
		Me15.adicionar(new Plato("Tallarines saltados","Chif2", 20));
		Me15.adicionar(new Plato("Pollo agridulce","Chif3", 25));
		Me15.adicionar(new Plato("Pato laqueado","Chif4", 35));
		Me15.adicionar(new Plato("Mapo Tofu","Chif5", 35));
		Me15.adicionar(new Plato("Pollo con almendras","Chif6", 35));
		
		CCircularM Me16 = new CCircularM();
		Me16.adicionar(new Plato("Hamburguesa simple","McD1", 20));
		Me16.adicionar(new Plato("Hamburguesa doble","McD2", 30));
		Me16.adicionar(new Plato("Hamburguesa triple","McD3", 35));
		Me16.adicionar(new Plato("Hamburguesa strogonof","McD4", 35));
		Me16.adicionar(new Plato("Hamburguesa a la BBQ huevo","McD5", 30));
		Me16.adicionar(new Plato("Hamburguesa a America","McD6", 30));
		Me16.adicionar(new Plato("Hamburguesa TexMex","McD7", 30));
		
		CCircularM Me17 = new CCircularM();
		Me17.adicionar(new Plato("6 Alitas BBQ","Tex1", 20));
		Me17.adicionar(new Plato("6 Alitas picantes","Tex2", 20));
		Me17.adicionar(new Plato("12 Alitas BBQ","Tex3", 37));
		Me17.adicionar(new Plato("12 Alitas picantes","Tex4", 37));
		Me17.adicionar(new Plato("24 Alitas BBQ","Tex5", 60));
		Me17.adicionar(new Plato("24 Alitas picantes","Tex6", 60));
		Me17.adicionar(new Plato("50 Alitas BBQ","Tex7", 100));
		
		CCircularM Me18 = new CCircularM();
		Me18.adicionar(new Plato("Ceviche de pescado","Pun1", 20));
		Me18.adicionar(new Plato("Ceviche de camarones","Pun2", 20));
		Me18.adicionar(new Plato("Ceviche de pulpo","Pun3", 37));
		Me18.adicionar(new Plato("Ceviche de mixto","Pun4", 37));
		Me18.adicionar(new Plato("Ceviche de mariscos","Pun5", 60));
		Me18.adicionar(new Plato("Ceviche de pescado y camarones","Pun6", 60));
		Me18.adicionar(new Plato("Ceviche de pescado y pulpo","Pun7", 100));
		
		CCircularM Me19 = new CCircularM();
		Me19.adicionar(new Plato("Saise","Cha1", 20));
		Me19.adicionar(new Plato("Chicharron","Cha2", 20));
		Me19.adicionar(new Plato("Sabalo","Cha3", 37));
		Me19.adicionar(new Plato("Trucha","Cha4", 37));
		Me19.adicionar(new Plato("Pacu","Cha5", 60));
		Me19.adicionar(new Plato("Sopa de Mani","Cha6", 20));
		
		CCircularM Me20 = new CCircularM();
		Me20.adicionar(new Plato("Tacos de carne","Cat1", 20));
		Me20.adicionar(new Plato("Tacos de pollo","Cat2", 20));
		Me20.adicionar(new Plato("Tacos de pescado","Cat3", 37));
		Me20.adicionar(new Plato("Tacos de camarones","Cat4", 37));
		Me20.adicionar(new Plato("Tacos de mixto","Cat5", 60));
		Me20.adicionar(new Plato("Tacos de carne y pollo","Cat6", 60));
		Me20.adicionar(new Plato("Tacos de pollo y pescado","Cat7", 60));
		Me20.adicionar(new Plato("Tacos de pescado y camarones","Cat8", 60));
		
		CCircularM Me21 = new CCircularM();
		Me21.adicionar(new Plato("Spaguetti a la carbonara","Dom1", 30));
		Me21.adicionar(new Plato("Spaguetti a la bolognesa","Dom2", 20));
		Me21.adicionar(new Plato("Spaguetti a la marinera","Dom3", 25));
		Me21.adicionar(new Plato("Lasagna","Dom4", 35));
		Me21.adicionar(new Plato("Raviolis","Dom5", 35));
		Me21.adicionar(new Plato("Canelones","Dom6", 35));
		Me21.adicionar(new Plato("Fettuccine Alfredo","Dom7", 40));
		Me21.adicionar(new Plato("Spaguetti al pesto","Dom8", 30));
		
		CCircularM Me22 = new CCircularM();
		Me22.adicionar(new Plato("Ceviche de pescado","Cal1", 20));
		Me22.adicionar(new Plato("Ceviche de camarones","Cal2", 20));
		Me22.adicionar(new Plato("Arroz Chaufa","Cal3", 37));
		Me22.adicionar(new Plato("Tallarines saltados","Cal4", 37));
		Me22.adicionar (new Plato("Papa a la Huancaina","Cal5", 60));
		Me22.adicionar(new Plato("Ceviche de pescado y camarones","Cal6", 60));
		Me22.adicionar(new Plato("Pollo a la brasa","Cal7", 20));
		
		
		//Macrodistritos
		
		M = new ColaMa();
		M.adicionar(new MacroDistrito("Cota Cota", "CC"));
		M.adicionar(new MacroDistrito("Cotahuma", "Co"));
		M.adicionar(new MacroDistrito("Max Paredes", "Mx"));
		M.adicionar(new MacroDistrito("San Antonio", "Sa"));
		M.adicionar(new MacroDistrito("Sur", "Su"));
		M.adicionar(new MacroDistrito("Periferia", "Pe"));
		M.adicionar(new MacroDistrito("Centro", "Ce"));
		M.adicionar(new MacroDistrito("Mallasa", "Mll"));
		M.adicionar(new MacroDistrito("Hampaturi", "Ha"));
		M.adicionar(new MacroDistrito("Zongo", "Zg"));
		
		
		// Emprendimientos
		
		LDobleEm E = new LDobleEm();
		E.adicionar(new Emprendedor("Carlos", "Perez", 4790063,"Comida China","Chifa Chang",250567), new Emprendimiento("Chifa Chang", "Comida Asiatica", "As 1"),Me,Cl);
		E.adicionar(new Emprendedor("Juan", "Zambrana", 2254087,"Pizza","Vendetta",780067), new Emprendimiento("Vendetta", "Comida Italiana", "It 1"),Me2,Cl2);
		E.adicionar(new Emprendedor("Pedro", "Mamani", 893572,"Carne a la parrilla","El meson del carnicero",865846), new Emprendimiento("El meson del carnicero", "Carne a la parrilla", "Parr 1"),Me3,Cl3);
		E.adicionar(new Emprendedor("Maria", "Gutierrez", 9743082,"Comida Japonesa","Samurai",7329472), new Emprendimiento("Samurai", "Comida Asiatica", "As 2"),Me4,Cl4);
		
		LDobleEm E2 = new LDobleEm();
		E2.adicionar(new Emprendedor("Luis", "Fernandez", 4529472,"Pastas","Tutto Pasta",760567), new Emprendimiento("Tutto Pasta", "Comida Italiana", "It 2"),Me5,Cl5);
		E2.adicionar(new Emprendedor("Jose", "Camacho", 348600,"Comida Cochabambina","Sabores Bolivianos",909874), new Emprendimiento("Sabores Bolivianos", "Comida Nacional", "Bo 1"),Me6,Cl6);
		E2.adicionar(new Emprendedor("Luis", "Fernandez", 832783,"Hamburguesas","Golosas",894732), new Emprendimiento("Golosas", "Comida Rapida", "Ra 1"),Me7,Cl7);
		E2.adicionar(new Emprendedor("Pedro", "Quispe", 2353466,"Ramen","Naruto",759769), new Emprendimiento("Naruto", "Comida Japonesa", "As 3"),Me8,Cl8);		
			
		LDobleEm E3 = new LDobleEm();
		E3.adicionar(new Emprendedor("Antonio", "Espinoza", 986768,"Alitas","FastWings",876787), new Emprendimiento("FastWings", "Comida Rapida", "Ra 2"),Me9,Cl9);
		E3.adicionar(new Emprendedor("Andrea", "Vargas", 8649369,"Pastas","Italy",27834584), new Emprendimiento("Italy", "Comida Italina", "It 3"),Me10,Cl10);
		E3.adicionar(new Emprendedor("Andres", "mujica", 7895655,"Milanesas","Milanga",289767), new Emprendimiento("Milanga", "Comida Bolivia", "Bo 2"),Me11,Cl11);
		E3.adicionar(new Emprendedor("Pablo", "Pereira", 827797,"Pollo frito","Piolin",780067), new Emprendimiento("Piolin", "Comida Rapida", "Ra 3"),Me12,Cl12);	
		
		LDobleEm E4 = new LDobleEm();
		E4.adicionar(new Emprendedor("Victor", "Bolivar", 8658832,"Pastas","Il Falco",7548887), new Emprendimiento("Il Falco", "Comida Italiana", "It 4"),Me13,Cl13);
		E4.adicionar(new Emprendedor("Cristian", "Valdez", 9865566,"Pizza","Pizzarte",867778), new Emprendimiento("Pizzarte", "Comida Italiana", "It 5"),Me14,Cl14);
		E4.adicionar(new Emprendedor("Huascar", "Gutierrez", 7567668,"Comida China","Chifa Huas",2578687), new Emprendimiento("Chifa Huas", "Comida Asiatica", "As 4"),Me15,Cl15);
		E4.adicionar(new Emprendedor("Claudia", "Espinoza", 4790366,"Hamburguesas","McDoña",843944), new Emprendimiento("McDoña", "Comida Rapida", "Ra 4"),Me16,Cl16);
			
		LDobleEm E5 = new LDobleEm();
		E5.adicionar(new Emprendedor("Gabriela", "Sossa", 8687699,"Alitas","Texas",3423555), new Emprendimiento("Texas", "Comida Rapida", "Ra5 "),Me17,Cl17);
		E5.adicionar(new Emprendedor("Mauricio", "Fernandez", 7865887,"Ceviche","Punto de Elena",8570567), new Emprendimiento("Punto de Elena", "Comida Peruana", "Pe 1"),Me18,Cl18);
		E5.adicionar(new Emprendedor("Lorena", "Tavera", 845970,"Comida Terijeña","El chapaco",1230129), new Emprendimiento("El chapaco", "Comida Boliviana", "Bo 3"),Me19,Cl19);
		
		LDobleEm E6 = new LDobleEm();
		E6.adicionar(new Emprendedor("Daniela", "Ossio", 8934767,"Tacos","La Catrina",986667), new Emprendimiento("La Catrina", "Comida Mejicana", "Me 1"),Me20,Cl20);
		E6.adicionar(new Emprendedor("Sabrina", "Duchen", 96777697,"Pastas","Domino",5476869), new Emprendimiento("Domino", "Comida Italiana", "It 6"),Me21,Cl21);
		E6.adicionar(new Emprendedor("Nicole", "Morales", 42356546,"Comida Peruana","El Callao",780067), new Emprendimiento("El Calloa", "Comida Peruana", "Pe 2"),Me22,Cl22);
		
		LDobleEm E7 = new LDobleEm();
		
		LDobleEm E8 = new LDobleEm();
		
		LDobleEm E9 = new LDobleEm();
		
		LDobleEm E10 = new LDobleEm();
		
		LDobleEm E11 = new LDobleEm();
		
		LDobleEm E12 = new LDobleEm();
		
		
		// Feria
		
		F = new LDobleF();
		F.adicionar(new FeriaMilColores("Feria 1", "Su", "10:00", "Plaza Humboldt","7/01/2025"), E);
		F.adicionar(new FeriaMilColores("Feria 2", "Co", "10:00", "Plaza Abaroa","14/02/2025"), E2);
		F.adicionar(new FeriaMilColores("Feria 3", "Mx", "10:00", "El Tejar","21/03/2025"), E3);
		F.adicionar(new FeriaMilColores("Feria 4", "Sa", "10:00", "Plaza San Antonio","28/04/2025"), E4);
		F.adicionar(new FeriaMilColores("Feria 5", "Pe", "10:00", "Plaza de los Heroes","5/05/2025"), E5);
		F.adicionar(new FeriaMilColores("Feria 6", "Ce", "10:00", "Plaza del Estudiante","12/06/2025"), E6);
		F.adicionar(new FeriaMilColores("Feria 7", "Mll", "10:00", "Plaza de Mallasa","19/07/2025"), E7);
		F.adicionar(new FeriaMilColores("Feria 8", "Ha", "10:00", "Plaza de Hampaturi","26/08/2025"), E8);
		F.adicionar(new FeriaMilColores("Feria 9", "Zg", "10:00", "Plaza de Zongo","2/09/2025"), E9);
		F.adicionar(new FeriaMilColores("Feria 10", "Mll", "10:00", "Plaza de Mallasa","25/10/2025"), E10);
		F.adicionar(new FeriaMilColores("Feria 11", "Su", "10:00", "Plaza Humboldt","2/11/2025"), E11);
		F.adicionar(new FeriaMilColores("Feria 12", "Ce", "10:00", "Plaza del Estudiante","9/12/2025"), E12);
		

	
		// Coordinadores
		
		PilaC C = new PilaC();
		C.adicionar(new CoordinadorGAMLP("Juan", "Perez", 4790983, "Co", "GAMLP-3450"));
		C.adicionar(new CoordinadorGAMLP("Serigio", "Gutierrez", 879733, "Mx", "GAMLP-3451"));
		C.adicionar(new CoordinadorGAMLP("Fabian", "Mamani", 345678, "Pe", "GAMLP-3452"));
		C.adicionar(new CoordinadorGAMLP("Maria", "Lopez", 845784, "Ce", "GAMLP-3453"));
		C.adicionar(new CoordinadorGAMLP("Jhanet", "Fernandez", 9874733, "Ha", "GAMLP-3454"));
		C.adicionar(new CoordinadorGAMLP("Jorge", "Quispe", 985679, "Zg", "GAMLP-3455"));
		C.adicionar(new CoordinadorGAMLP("Rodrigo", "Jimenez", 876543, "Mll", "GAMLP-3456"));

		
        
		@SuppressWarnings("unused")
		Display d = new Display();
        
		
		mostrarMayorIngresos(F, "Feria 1");
	}


	// Metodos para retornar estructuras en display
	
	 public static LDobleF getListaFerias() 
	 {
	        return F;
	 }
	 
	 public static ColaMa getColaMacrodritritos() {
	        return M;
	    }
	 
	 
	 // 1. Mostrar la feria donde se encuentra un emprendimiento x
	 
	 public static void encuentraRes(LDobleF A, String x) {
		    int sw = 0;
		    NodoF f = A.getP();
		    while (f != null) {
		        LDobleEm E = f.getEmprendedores();
		        NodoEm em = E.getP();
		        while (em != null) {
		            Emprendedor emprendedor = em.getEmprendedor();
		            if (emprendedor != null && emprendedor.getNombreEmprendimiento().equals(x)) {
		                System.out.println("Feria: " + f.getFeria().getLugar() + " - Fecha: " + f.getFeria().getFecha());
		                sw = 1;
		            }
		            em = em.getSig();
		        }
		        f = f.getSig();
		    }

		    if (sw == 0) {
		        System.out.println("No se encontro el restaurante");
		    }
		}
	 
		
		// 2. Mostar los emprendimiento con mayores ingresos de la feria x
		
		public static void mostrarMayorIngresos(LDobleF A , String x)  // muestra los emprendimientos con mayores ingresos de la feria en base al Id de la feria
		{
			int sw=0;
			int may=0;
			LDobleEm aux=new LDobleEm();
            NodoF f = A.getP();
            while (f != null) 
            {
                if (f.getFeria().getIdFeria().equals(x)) 
                {
                    NodoEm e = f.getEmprendedores().getP();
                    while (e != null) 
                    {
                        may = mayorIngresos(f.getEmprendedores().getP(), 0);
                    	if (sumaingresos(e.getEmprendimiento().getCl().getP()) == may) 
                        {
                            aux.adicionar(e.getEmprendedor(), e.getEmprendimiento().getEmprendimiento(), null, null);
                            sw = 1;
                        }
                        e = e.getSig();
                    }
                }
                f = f.getSig();
            }
            if (sw==0)
                System.out.println("No se encontro la feria");
            else
            	aux.mostrar();
			
		}
		
		
		
		public static int mayorIngresos(NodoEm r, int may) // busca el mayor ingreso de la feria
		{
			if (r != null) 
			{
				if (sumaingresos(r.getEmprendimiento().getCl().getP()) > may) 
					may = sumaingresos(r.getEmprendimiento().getCl().getP());
				
				mayorIngresos(r.getSig(), may);
			}
			
			return may;
		}
		
		public static int sumaingresos (NodoCl r) // sumas las compras de todos los clientes
		{
			if (r == null)
				return 0;
			else
				
				return comprascliente(r.getListaCompras().getP()) + sumaingresos(r.getSig());
			
		}
		
		public static int comprascliente(NodoCo r) //suma toas las compras de un cliente
		{
			if (r == null)
				return 0;
			else
				return r.getPlato().getPrecio() + comprascliente(r.getSig());
		}
		
		// 3. Enocontrar la feria x y mostrar el lugar y fecha en el que estara
		
				public static void buscarferia(LDobleF A, ColaMa M, String x)
				{
					int sw=0;
					LDobleF aux=new LDobleF();
					NodoF w=A.getP();
					while (w != null) 
					{	
						if (x.equals(nomMacro(M, w.getFeria().getIdMacroDistrito())))
						{
							aux.adicionar(w.getFeria(),null);
							sw=1;
						}
						w = w.getSig();
					}
					if (sw==0)
						System.out.println("No se encontro la feria");
					else
					{
						NodoF aux2=aux.getP();
						while (aux2 != null) 
						{
							System.out.println(aux2.getFeria().getLugar());
							aux2 = aux2.getSig();
						}
					}
						
				}
				
				public static String nomMacro (ColaMa m, String x)
				{
					ColaMa aux=new ColaMa();
				
						while (!m.esvacia())
						{
							MacroDistrito r=m.eliminar();
							if (r.getIDmacrodistrito().equals(x))
							{
								m.adicionar(r);
								return r.getNombre();
							}
							m.adicionar(r);
							aux.adicionar(r);
						}
						m.vaciar(aux);
						
						return "";
				        
				}
		
		// 4. mostrar menu de un emprendimiento x
		
		public static void mosMenuEmp(LDobleF A, String x) 
		{
			int sw=0;
			NodoF f=A.getP();
			while (f != null) 
			{
				NodoEm e=f.getEmprendedores().getP();
				while (e != null) 
				{
					if (x.equals(e.getEmprendedor().getNombreEmprendimiento())) 
					{
						System.out.println("Restaurate : " + e.getEmprendedor().getNombreEmprendimiento()+ " - Especialidad: " +e.getEmprendedor().getEspedialidad());
						mosMenu(e.getEmprendimiento());
						sw = 1;
					}
					e = e.getSig();
				}
				f = f.getSig();
			}
			
					
			if (sw==0)
                System.out.println("No se encontro el emprendimiento");
		}
		
		
		
		public static void mosMenu(NodoE a) 
		{
			CCircularM aux=new CCircularM();
			CCircularM m = a.getMenu();
			while (!m.esvacia())
			{
				Plato p=m.eliminar();
				System.out.println("Plato: "+p.getNombre()+" - Precio: "+p.getPrecio());
				aux.adicionar(p);
			}
			m.vaciar(aux);
		}
				
		// 5 mover emprendedores de una feria a otra
		
		public static void moverEm(LDobleF A, String x, String y) {
			NodoEm aux = null;  // Inicializar como null
			NodoF f = A.getP();
			
			while (f != null) {
				LDobleEm E = f.getEmprendedores();
				NodoEm em = E.getP();
				
				while (em != null) {
					NodoEm siguiente = em.getSig();  // Guardar siguiente antes de eliminar

					if (em.getEmprendedor().getNombreEmprendimiento().equals(x)) {
						aux = eliminarEm(E, em);
						break;  // Salir del loop interno después de encontrar
					}
					em = siguiente;
				}
				
				if (aux != null) break;  // Salir del loop externo si ya encontró
				f = f.getSig();
			}
			
			if (aux != null) {  // Validar que se encontró el emprendimiento
				adiemp(aux, A, y);
				encuentraRes(A, x);
			} else {
				System.out.println("Emprendimiento no encontrado: " + x);
			}
		}		
		public static void adiemp(NodoEm a, LDobleF A, String y) 
		{
			NodoF f = A.getP();
			while (f != null) 
			{
				LDobleEm E = f.getEmprendedores();
				if (f.getFeria().getIdFeria().equals(y)) 
				{
					adifin(E, a);
				}
				
				f = f.getSig();
			}
		}
		
		public static void adifin(LDobleEm E, NodoEm a) 
		{
			a.setSig(null);  // Limpiar puntero siguiente
			a.setAnt(null);  // Limpiar puntero anterior
			
			NodoEm q = E.getP();
			if (E.getP() == null) {
				E.setP(a);
			} else {
				while (q.getSig() != null) {
					q = q.getSig();
				}
				q.setSig(a);
				a.setAnt(q);
			}
		}

		public static NodoEm eliminarEm(LDobleEm E,NodoEm A) 
		{
			NodoEm q = E.getP();
			while (q != null) 
			{
				if (A==q)
				{
					if (E.getP() == q) 
					{
						E.setP(q.getSig());
	            		//E.getP().setAnt(null);
	            		q.setSig(null);
					} 
					else 
					{
						NodoEm a = q.getAnt();
						NodoEm b = q.getSig();
						a.setSig(b);
						if (b != null)
							b.setAnt(a);
						q.setSig(null);
						q.setAnt(null);
					}
					return q;
				}
				if (q!=null)
					q = q.getSig();
			}
			return null;
		}
				
		// 6. buscar tipo de comida 
		
		public static void buscarComida(LDobleF A, String x) 
		{
			int sw=0;
			LDobleEm E = new LDobleEm();
			NodoF f = A.getP();
			while (f != null) 
			{
				NodoEm e = f.getEmprendedores().getP();
				while (e != null) {
					if (e.getEmprendedor().getEspedialidad().equals(x)) 
					{
						E.adicionar(e.getEmprendedor(), null, null,null);
						sw = 1;
					}
					e = e.getSig();
				}
				f = f.getSig();
			}
			
			if (sw==0)
                System.out.println("No se encontro el tipo de comida");
			else
				mostarRes(E);
		}
		
		//mostrar restaurante
		
		public static void mostarRes(LDobleEm E)
		{
			NodoEm e=E.getP();
            while (e != null) 
            {
                System.out.println("Restaurante: "+e.getEmprendedor().getNombreEmprendimiento());
                e = e.getSig();
            }
        }

}

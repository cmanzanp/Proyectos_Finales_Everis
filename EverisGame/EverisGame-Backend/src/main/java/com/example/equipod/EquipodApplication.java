package com.example.equipod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.equipod.persistence.EverisGame;
import com.example.equipod.persistence.EverisUser;
import com.example.equipod.services.EverisGameServicesImpl;
import com.example.equipod.services.EverisUsersServicesImpl;

@SpringBootApplication
public class EquipodApplication implements CommandLineRunner{
		
	
	@Autowired
	private EverisUsersServicesImpl userService;
	
	@Autowired
	private EverisGameServicesImpl gameService;
		
		
	public static void main(String[] args) {
		SpringApplication.run(EquipodApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/** AÑADIMOS UN USUARIO */
		EverisUser user1 = new EverisUser();
		user1.setMail("admin@gmail.com");
		user1.setPass("pass");
		user1.setPlatform("PS5");
		user1.setUserName("admin");
		
		userService.AddUsers(user1);
		
		/** AÑADIMOS VARIOS JUEGOS A LA BASE DE DATOS PARA REALIZAR PRUEBAS */
        EverisGame game1 = new EverisGame();
        game1.setTitle("Uncharted 1");
        game1.setDescription("Juego de acción que relata las aventuras de Nathan Drake buscando El Dorado");
        game1.setGenre("Accion");
        game1.setPlatform("Play Station");
        game1.setRate(4);
        game1.setUrlImage("https://lh3.googleusercontent.com/proxy/SmFAYCKT1ZJwxSyGs_3aZCZY-3I3nmxlOErzCp1MnbygMkCd6bUKBu_AdIRJJsMc7qsIi7pNIHwSVSQ2kuaXoUgPDK7rEd8N_NgYFCvG5bkX76WBsCK8eGvWJu3E3hJNHHhy_lqv79vpPw");
       
        gameService.AddGame(game1);
       
        EverisGame game2 = new EverisGame();
        game2.setTitle("Uncharted 2");
        game2.setDescription("Juego de acción que relata las aventuras de Nathan Drake buscando la ciudad perdida de Shambala");
        game2.setGenre("Accion");
        game2.setPlatform("Play Station");
        game2.setRate(5);
        game2.setUrlImage("https://i.blogs.es/b10088/uncharted-2-1136/1366_2000.jpg");
       
        gameService.AddGame(game2);
       
        EverisGame game3 = new EverisGame();
        game3.setTitle("Uncharted 3");
        game3.setDescription("Juego de acción que relata las aventuras de Nathan Drake buscando la Atlantida de las arenas");
        game3.setGenre("Accion");
        game3.setPlatform("Play Station");
        game3.setRate(5);
        game3.setUrlImage("https://casivg.files.wordpress.com/2016/08/uncharted-3-wallpaper-1-hd.jpg");
       
        gameService.AddGame(game3);
       
        EverisGame game4 = new EverisGame();
        game4.setTitle("Cyberpunk 2077");
        game4.setDescription("Un RPG de mundo abierto ambientado en un futuro siniestro, y tan siniestro...");
        game4.setGenre("RPG");
        game4.setPlatform("Todas las plataformas");
        game4.setRate(2);
        game4.setUrlImage("https://i2.wp.com/www.thumbsticks.com/wp-content/uploads/2020/01/Cyberpunk-2077-delayed.jpg?resize=1000%2C600&ssl=1");
       
        gameService.AddGame(game4);
       
        EverisGame game5 = new EverisGame();
        game5.setTitle("The last of us");
        game5.setDescription("En un mundo post apocalíptico somos Joel, un traficante que aceptará el trabajo mas dificil de su vida");
        game5.setGenre("Aventura");
        game5.setPlatform("Play Station");
        game5.setRate(15);
        game5.setUrlImage("https://i.pinimg.com/originals/71/42/25/714225334fa008222c46bb7cff515468.jpg");
       
        gameService.AddGame(game5);
       
        EverisGame game6 = new EverisGame();
        game6.setTitle("The last of us parte 2");
        game6.setDescription("La continuación de la anterior entrega, esta vez somos Ellie y mejor no te digo nada juegalo que es la leche");
        game6.setGenre("Aventura");
        game6.setPlatform("Play Station");
        game6.setRate(15);
        game6.setUrlImage("https://fanaticosdelhardware.com/wp-content/uploads/2020/06/PS_TLOU_LAUNCH_TRAILER1.jpg");
       
        gameService.AddGame(game6);
	}

}






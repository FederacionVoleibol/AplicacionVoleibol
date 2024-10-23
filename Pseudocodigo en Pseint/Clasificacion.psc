Algoritmo Clasificacion
    // Definir variables para los puntos, goles a favor y goles en contra
    Definir puntos_A, puntos_B, puntos_C, puntos_D, puntos_E, puntos_F Como Entero
    Definir goles_A, goles_B, goles_C, goles_D, goles_E, goles_F Como Entero
    Definir goles_en_contra_A, goles_en_contra_B, goles_en_contra_C, goles_en_contra_D, goles_en_contra_E, goles_en_contra_F Como Entero
    
    // Inicializar los puntos, goles a favor y goles en contra
    puntos_A <- 0
    puntos_B <- 0
    puntos_C <- 0
    puntos_D <- 0
    puntos_E <- 0
    puntos_F <- 0
    
    goles_A <- 0
    goles_B <- 0
    goles_C <- 0
    goles_D <- 0
    goles_E <- 0
    goles_F <- 0
    
    goles_en_contra_A <- 0
    goles_en_contra_B <- 0
    goles_en_contra_C <- 0
    goles_en_contra_D <- 0
    goles_en_contra_E <- 0
    goles_en_contra_F <- 0
	
    // Procesar 3 partidos
    Para partido <- 1 Hasta 3 Con Paso 1
        Si partido = 1 Entonces
            // Partido 1: Equipo A vs Equipo B
            Escribir "Introduce los goles del CV Sayre Mayser en el partido ", partido, ":"
            Leer goles_A
            Escribir "Introduce los goles del CD Zaragoza en el partido ", partido, ":"
            Leer goles_B
			
            // Actualizar goles a favor y goles en contra
            goles_en_contra_A <- goles_en_contra_A + goles_B
            goles_en_contra_B <- goles_en_contra_B + goles_A
			
            Si goles_A > goles_B Entonces
                puntos_A <- puntos_A + 3
            Sino
                Si goles_A < goles_B Entonces
                    puntos_B <- puntos_B + 3
                Sino
                    puntos_A <- puntos_A + 1
                    puntos_B <- puntos_B + 1
                FinSi
            FinSi
        FinSi
		
        Si partido = 2 Entonces
            // Partido 2: Equipo C vs Equipo D
            Escribir "Introduce los goles del CV Barça  en el partido ", partido, ":"
            Leer goles_C
            Escribir "Introduce los goles del CV Alcobendas en el partido ", partido, ":"
            Leer goles_D
			
            // Actualizar goles a favor y goles en contra
            goles_en_contra_C <- goles_en_contra_C + goles_D
            goles_en_contra_D <- goles_en_contra_D + goles_C
			
            Si goles_C > goles_D Entonces
                puntos_C <- puntos_C + 3
            Sino
                Si goles_C < goles_D Entonces
                    puntos_D <- puntos_D + 3
                Sino
                    puntos_C <- puntos_C + 1
                    puntos_D <- puntos_D + 1
                FinSi
            FinSi
        FinSi
		
        Si partido = 3 Entonces
            // Partido 3: Equipo E vs Equipo F
            Escribir "Introduce los goles del CD Avila Voleibol en el partido ", partido, ":"
            Leer goles_E
            Escribir "Introduce los goles del CV Madrid Chamberí en el partido ", partido, ":"
            Leer goles_F
			
            // Actualizar goles a favor y goles en contra
            goles_en_contra_E <- goles_en_contra_E + goles_F
            goles_en_contra_F <- goles_en_contra_F + goles_E
			
            Si goles_E > goles_F Entonces
                puntos_E <- puntos_E + 3
            Sino
                Si goles_E < goles_F Entonces
                    puntos_F <- puntos_F + 3
                Sino
                    puntos_E <- puntos_E + 1
                    puntos_F <- puntos_F + 1
                FinSi
            FinSi
        FinSi
    FinPara
	
	
	
    // Mostrar solo la clasificación final al final del programa
    Escribir "Clasificación final:"
    Escribir "CV Sayre Mayser: Puntos=", puntos_A, " Goles a favor=", goles_A, " Goles en contra=", goles_en_contra_A
    Escribir "CD Zaragoza: Puntos=", puntos_B, " Goles a favor=", goles_B, " Goles en contra=", goles_en_contra_B
    Escribir "CV Barsa: Puntos=", puntos_C, " Goles a favor=", goles_C, " Goles en contra=", goles_en_contra_C
    Escribir "CV Alcobendas: Puntos=", puntos_D, " Goles a favor=", goles_D, " Goles en contra=", goles_en_contra_D
    Escribir "CD Avila Voleibol: Puntos=", puntos_E, " Goles a favor=", goles_E, " Goles en contra=", goles_en_contra_E
    Escribir "CV Madrid Chamberí: Puntos=", puntos_F, " Goles a favor=", goles_F, " Goles en contra=", goles_en_contra_F
	
FinAlgoritmo

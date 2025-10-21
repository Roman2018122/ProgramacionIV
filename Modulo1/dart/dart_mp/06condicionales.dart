void main() {

    final int cupoMaximo = 50;
    final int cuposVendidos = 2;

    print("--- 🎫 Gestor de Conferencias y Eventos ---");
    print("Cupos vendidos: $cuposVendidos");  

    if (cuposVendidos > cupoMaximo) {
        print('¡ALERTA! El evento está *sobrevendido*.');

    }
    
    final int umbralMinimo = 20; 
    if (cuposVendidos < umbralMinimo) {
        print('El evento aún no alcanza el *mínimo* de $umbralMinimo inscritos. Faltan ${umbralMinimo - cuposVendidos} inscritos.');

    }

    if (cuposVendidos == 2) { 
        print('Solo se han vendido *2 cupos*. Las ventas van muy lentas.');

    }

    print('\n--- Evaluación General de Cupos ---');
    if (cuposVendidos > cupoMaximo) {
        print('El evento ya excedió el cupo máximo de $cupoMaximo. ¡Lleno total!');
    } else {
        print('Aún quedan *${cupoMaximo - cuposVendidos} cupos* disponibles.');

    }

    if (cuposVendidos == cupoMaximo) {
        print('El evento está *CONFIRMADO* y completamente vendido.');
    } else {
        print('El evento está *Pendiente* de completar su aforo.');

    }

}
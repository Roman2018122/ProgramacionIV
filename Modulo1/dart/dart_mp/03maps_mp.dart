void main(){
    print("Maps");
    final Map <String, dynamic> evento = {
        'lugar': 'Quito',
        'fecha' : '11/06/2024',
        'isAlive' : true,
        'tipo':<String>['conferencias'],
        'images': {
            1:'src/ditto.jpg',
            2:'src/ditto.jpg'
        }
    }
    print('El lugar del evento es: ${evento['lugar']}');
    print('¿Está activo? ${evento['isAlive']}');
    print('El primer tipo es: ${evento['tipo'][0]}');

}
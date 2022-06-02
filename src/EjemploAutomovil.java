public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("lx-456");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");
        subaru.setTipo(TipoAutomovil.SEDAN);

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("amarillo");
        mazda.setTipo(TipoAutomovil.STATION_WAGON);

        Automovil nissan = new Automovil("nissan","zx-12","verde",TipoAutomovil.HATCHBACK);
        Automovil nissan2 = new Automovil("nissan","zx-12","verde",3.0,60);
        Automovil nissan3 = new Automovil("nissan","zx-12","verde",3.0,60);

        Automovil.setColorGeneral("plomo"); // desde aquí también se puede cambiar el color
        nissan.setColor("negro"); // con el set si se puede cambiar solo el obj



        System.out.println("son iguales? " + (nissan==nissan2));
        System.out.println("con equals ? " + (nissan.equals(nissan3)));
        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(subaru.frenar());
        System.out.println(mazda.frenar());
        System.out.println(subaru.acelerar(3000));
        System.out.println(mazda.acelerar(3000));
        System.out.println(subaru.acelerarFrenar(4000));
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("kil/l = " + subaru.calcularConsumo(300,0.6f));
        System.out.println("kil/l = " + subaru.calcularConsumo(300,60));
        System.out.println("velocidad max = " + Automovil.VEL_MAX);
        System.out.println("velocidad min = " + Automovil.VEL_MIN);



    }
}

# AndroidFragmentTest1
Prueba de fragments en android, ejemplo sencillo donde con 2 botones cambiamos el fragment


Se hace prueba con fragments en android 

Usando el siguiente método conseguimos que se cambie el contenido del fragment

    public void selecFrag(View view) {

        // Según el boton creamos un fragmento u otro
        Fragment frag;
        if(view == findViewById(R.id.btn1)){
            frag = new Fragment1();
        }else{
            frag = new Fragment2();
        }

        // Usamos el gestor de fragmentos para los cambios
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();

        trans.replace(R.id.fragment, frag);
        trans.commit();
    }
    
![primer fragment](https://user-images.githubusercontent.com/29311335/32507205-2d727c90-c3e7-11e7-98a9-1efbff1773ad.png)
![segundo fragment](https://user-images.githubusercontent.com/29311335/32507209-2fea9dfe-c3e7-11e7-91a0-2b67bc941906.png)

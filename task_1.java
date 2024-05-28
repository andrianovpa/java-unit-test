@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Не верное расчитывается допустимый возраст", true, isAdult);// Напиши код здесь
}
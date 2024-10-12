package shit;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Objects;
import java.util.Random;

public class Fuck extends javafx.application.Application {
    @Override
    public void start(Stage stage) {
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int d = 40;
//        int e = 50;
//        int f = 60;
//        int g = 70;
//        int h = 80;
//        int i = 90;
//        int j = 100;
//
//        if (a == 1) {
//            System.out.println("Level 1");
//            if (b == 2) {
//                System.out.println("Level 2");
//                if (c == 3) {
//                    System.out.println("Level 3");
//                    if (d == 4) {
//                        System.out.println("Level 4");
//                        if (e == 5) {
//                            System.out.println("Level 5");
//                            if (f == 6) {
//                                System.out.println("Level 6");
//                                if (g == 7) {
//                                    System.out.println("Level 7");
//                                    if (h == 8) {
//                                        System.out.println("Level 8");
//                                        if (i == 9) {
//                                            System.out.println("Level 9");
//                                            if (j == 10) {
//                                                System.out.println("Level 10");
//                                            } else {
//                                                System.out.println("Fuck you!");
//                                            }
//                                        } else {
//                                            System.out.println("Fuck you!");
//                                        }
//                                    } else {
//                                        System.out.println("Fuck you!");
//                                    }
//                                } else {
//                                    System.out.println("Fuck you!");
//                                }
//                            } else {
//                                System.out.println("Fuck you!");
//                            }
//                        } else {
//                            System.out.println("Fuck you!");
//                        }
//                    } else {
//                        System.out.println("Fuck you!4");
//                    }
//                } else {
//                    System.out.println("Fuck you!");
//                }
//            } else {
//                System.out.println("Fuck you!");
//            }
//        } else {
//            System.out.println("Fuck you!");
//        }

        for (int k = 0; k < 100; k++) {
            c();
            f();
        }
    }

    private void c() {
        ImageView imageView = new ImageView(new Image(Objects.requireNonNull(getClass().getResource("bus.png")).toExternalForm()));
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(530);
        imageView.setFitHeight(1100);

        Stage stage = new Stage();
        stage.setTitle("Fuck!");
        stage.setScene(new Scene(new StackPane(imageView), 530, 1100));
        stage.show();
    }

    private void f() {
        Stage stage = new Stage();
        stage.setTitle("fuck!!!!!!!!!");

        stage.setScene(new Scene(new StackPane(new Label("Fuck you!")), 30, 50));

        Random random = new Random();

        stage.setX(random.nextDouble() * (javafx.stage.Screen.getPrimary().getBounds().getWidth() - 300));
        stage.setY(random.nextDouble() * (javafx.stage.Screen.getPrimary().getBounds().getHeight() - 200));

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

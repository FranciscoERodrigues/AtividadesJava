����   B [  atividade4/VogalConsoante9  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Latividade4/VogalConsoante9; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Digite uma letra:
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * next ()Ljava/lang/String;
 , . - java/lang/String / 0 length ()I
 , 2 3 4 charAt (I)C   6 7 8 makeConcatWithConstants (C)Ljava/lang/String;  6 ; +Entrada inválida! Digite apenas uma letra.
  = >  close args [Ljava/lang/String; sc Ljava/util/Scanner; entrada Ljava/lang/String; letra C StackMapTable 
SourceFile VogalConsoante9.java BootstrapMethods
 L N M $java/lang/invoke/StringConcatFactory 7 O �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; K R Essa letra  é uma vogal T Essa letra  é uma consoante InnerClasses W %java/lang/invoke/MethodHandles$Lookup Y java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	            �� Y� � L� � !+� 'M,� +� c,� 1>a� 9e� 3i� -o� 'u� !A� E� I� O� 	U� � � 5  � !� � � 9  � !� � :� !+� <�    
   :    	          &  D  b  n  q  }  �  �  �      *    � ? @    � A B   u C D  & W E F  G    � b  ,�   H    I J     P  Q P  S U   
  V X Z 
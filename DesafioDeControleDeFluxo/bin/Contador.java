����   A [  Contador  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 
LContador; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Digite o primeiro parâmetro
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , Digite o segundo parâmetro
  . / 0 contar (II)V 2 /O segundo número deve ser maior que o primeiro 4 ParametrosInvalidosException args [Ljava/lang/String; sc Ljava/util/Scanner; parametroUm I parametroDois e LParametrosInvalidosException; StackMapTable 6 
Exceptions
 3 	   C D E makeConcatWithConstants (I)Ljava/lang/String; parametroum parametrodois 
quantidade i 
SourceFile Contador.java BootstrapMethods
 N P O $java/lang/invoke/StringConcatFactory D Q �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; M T Imprimindo número:  InnerClasses W %java/lang/invoke/MethodHandles$Lookup Y java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	       �     8� Y� � L� � !+� '=� +� !+� '>� -� :� 1� !�  % * - 3  
   & 	            	 %  *  /  7     4    8 5 6    - 7 8     9 :  %  ; :  /  < =  >    � -  ?   3	  / 0  @     3    �     +� � 3Y� A�d=>� � � B  � !����    
                ! "   * $    *    + F :     + G :    H :    I :  >   	 �   J    K L     R  S U   
  V X Z 
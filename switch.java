����   A M   com/piseth/homework/school/hw_02  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this "Lcom/piseth/homework/school/hw_02; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Enter Number of the Week 1-7:
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V
  ( ) * nextInt ()I ,   . Monday 0 Tuesday 2 	Wednesday 4 Thursday 6 Friday 8 Saturday : Sunday < Invalided Input
 " > ? & println args [Ljava/lang/String; sc Ljava/util/Scanner; 	daynumber I dayname Ljava/lang/String; StackMapTable J java/lang/String 
SourceFile 
hw_02.java !               /     *� �    
                    	           }� Y� � L� � !+� '=+N�      V         ,   2   8   >   D   J   P-N� */N� $1N� 3N� 5N� 7N� 9N� ;N� -� =�    
   >          &  6 H 8 N 9 T : Z ; ` < f = l > r ? u A | B    *    } @ A    r B C   e D E   b F G  H    	� H  I  K    L
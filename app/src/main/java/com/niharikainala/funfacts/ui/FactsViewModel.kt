package com.niharikainala.funfacts.ui

import androidx.lifecycle.ViewModel

class FactsViewModel : ViewModel() {

    fun generateRandomFacts(selectedAnimal: String): String {
        return if (selectedAnimal == "Dog") {
            getDogFacts().random()
        } else {
            getCatFacts().random()
        }
    }

    fun getDogFacts(): List<String> {
        val dogFacts = listOf(
            "Dogs have an incredible sense of smell, capable of detecting scents up to 100,000 times more effectively than humans.",
            "The Basenji dog breed is unique because it doesn't bark like other dogs; instead, it produces a unique yodel-like sound.",
            "The world's smallest dog breed is the Chihuahua, while the largest dog breed is the Great Dane.",
            "Dogs have three eyelids. The third eyelid, called the nictitating membrane or haw, helps keep the eye lubricated and protected.",
            "A dog's nose print is as unique as a human fingerprint and can be used for identification purposes.",
            "The Labrador Retriever is one of the most popular dog breeds globally and is known for its friendly and outgoing nature.",
            "Dogs can understand up to 250 words and gestures, making them highly trainable and intelligent animals.",
            "The Norwegian Lundehund is a dog breed that has six toes on each foot, which helped them climb steep cliffs in their native Norway.",
            "Dogs' sense of hearing is also remarkable, capable of detecting frequencies ranging from 40 Hz to 60,000 Hz.",
            "Dalmatians are born completely white and develop their spots as they grow older.",
            "Dogs are known to be loyal companions and are often referred to as 'man's best friend' due to their strong bond with humans.",
            "Puppies are born blind, deaf, and toothless but quickly develop these senses within the first few weeks of life.",
            "The Basenji is the only breed of dog that can't bark."
        )
        return dogFacts
    }

    fun getCatFacts(): List<String> {
        val catFacts = listOf(
            "A group of cats is called a 'clowder.'",
            "The world's oldest known pet cat existed 9,500 years ago.",
            "Cats can rotate their ears 180 degrees.",
            "A cat's nose pad is ridged with a unique pattern, much like a human fingerprint.",
            "Cats have a special reflective layer behind their retinas called the tapetum lucidum, which enhances their night vision.",
            "The average cat sleeps for about 12-16 hours a day.",
            "Cats use their whiskers to measure openings and detect changes in their environment.",
            "The Turkish Van breed of cat is known for its love of swimming and has a water-resistant coat.",
            "Cats have five toes on their front paws but only four toes on their back paws.",
            "Cats have a specialized collarbone that allows them to always land on their feet when falling, known as the 'righting reflex.'",
            "Calico cats are almost always female due to the genetic factors that determine fur color.",
            "Cats have a strong preference for cleanliness and spend a significant amount of time grooming themselves.",
            "The world's longest domestic cat on record measured over 3 feet in length from nose to tail.",
            "Cats have a unique vocalization called 'chattering' when they see birds or other prey through a window.",
            "The Maine Coon is one of the largest domestic cat breeds and is known for its friendly and sociable nature.",
            "Cats have a specialized grooming tool on their tongue called papillae, which helps them clean their fur efficiently.",
            "In ancient Egypt, cats were highly revered and worshipped as symbols of grace and protection."
        )
        return catFacts
    }


}
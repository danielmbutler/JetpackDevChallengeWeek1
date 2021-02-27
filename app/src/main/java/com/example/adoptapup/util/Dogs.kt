package com.example.adoptapup.util

import com.example.adoptapup.models.PuppyModel

object Dogs {



    fun provideDogsList(): List<PuppyModel>{
        val dog1 = PuppyModel(
            name = "Bruno" ,
            sex = "Male",
            age = 2,
            Story = "Hello there, I'm Bruno!I'm an older boy but don't let that fool you, I still have plenty of fun and love to share! I'm looking for a new home where I can learn to de-stress and unwind. One of the best ways of doing this is going for nice walks with plenty to smell. I love my walks and playing in the garden!I would prefer to be the only pet in the home please, as I like to be the sole focus or your affections. I like to be by someone's side all the time, and don't like being left alone. My new family will need to be understanding of this and help me to relax and help me build up how long I can be left slowly.I'm really excited to find a new home and make someone feel so happy and loved!Please fill in a home finder today. Goodbye for now! x",
            breed = "Staffordshire Bull Terrier",
            color = "White",
            Image = "https://s3.eu-west-2.amazonaws.com/images.petlist.co.uk/2_410492.jpg",
            likes = null,
            dislikes = null)

        val dog2 = PuppyModel(
            name = "ARIEL" ,
            sex = "Female",
            age = 1,
            Story = "She is a young Mali with a lot of love to give. We are looking for extremely experienced adopters to take on this beautiful girl. It is vital that you have experience with nervous/anxious dogs. Ariel is looking for a nice quiet house hold away from traffic in a rural setting. Poor Ariel has never been in a home before. Sadly she has grown up in kennels along with her siblings. Ariel cannot live with cats, dogs or children under the age of 16. Ariel has never been in a home before, this means that she is not house trained and that she will need understanding owners who can give her lots of time and patience so that she can get used to the household.",
            breed = "Belgian Shepherd",
            color = "Brown",
            Image = "https://s3.eu-west-2.amazonaws.com/images.petlist.co.uk/2_428223.jpg",
            likes = null,
            dislikes = null)

        val dog3 = PuppyModel(
            name = "Bert" ,
            sex = "Male",
            age = 9,
            Story = "Bert is a 9-year-old Lurcher who has been through a lot over the past year or so. Don't let his age fool you, his is such a fun, loving lad who is full of beans and up for any adventure! He LOVES toys, especially squeaky ones, so his new home will need an endless supply for Bert to play with! He has a cheeky side, where he knows how to wiggle his way into your heart and get extra treaties off you. He has really been enjoying his training sessions here at the centre and is eager to learn more. He has made amazing progress with his dog socialisation here at the centre, so new owners will need to continue this once home. Bert is going to need a secure, private garden to run around in as he will be going home on an onlead in public disclaimer. Bert can be quite greedy around food, so his new home will need to have a place for him to go during human dinner time! He won't be able to live with cats or other dogs but can have dog friends out and about if introduced in the right way (our behaviour team can give you some guidance on this). He can live with children aged 14 and above.",
            breed = "Lurcher",
            color = "Black",
            Image = "https://s3.eu-west-2.amazonaws.com/images.petlist.co.uk/2_425078.jpg",
            likes = null,
            dislikes = null)

        val dog4 = PuppyModel(
            name = "Wishbone" ,
            sex = "Male",
            age = 14,
            Story = "Wishbone is a sweet boy, but is very sad in kennels and probably still grieving over the loss of his owner. He gets very excited when heading out for a walk and does take time to settle once you go into the kennel with him. He enjoys meeting other dogs but doesn't get much from them but will happily walk with them. Wishbone is a 14 year old Terrier who has his paws crossed for a warm, cosy retirement home with endless amounts of love and attention. He will need a secure garden with limited leaving hours. He can live with children aged 12 and above. Wishbone will need to be the only dog in the home. Due to current government guidelines all applicants must live within 30-minute drive from the Harefield centre so we can facilitate our 'Handover at home' process. Applicants will need a secure, private garden with direct, outside access.",
            breed = "Terrier Cross",
            color = "White",
            Image = "https://s3.eu-west-2.amazonaws.com/images.petlist.co.uk/2_428502.jpg",
            likes = null,
            dislikes = null)



        val dogslist = arrayListOf<PuppyModel>()

        dogslist += dog1
        dogslist += dog2
        dogslist += dog3
        dogslist += dog4


        return dogslist
    }
}
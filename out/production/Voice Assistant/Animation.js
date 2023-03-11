let mic;

function setup() {
    createCanvas(200, 200)
    mic = new p5.AudioIn();
    mic.start();
}

function draw() {
    background(51);
    let vol = mic.getLevel();
    ellipse(height/2, width/2, vol*500, vol*500);
    console.log('volume', vol);
}
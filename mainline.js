
let LZString = require("./lzstring.js");

var orig = '/9j/4AAQSkZJRgABAQEAYABgAAD/2wBDAA0JCgsKCA0LCgsODg0PEyAVExISEyccHhcgLikxMC4pLSwzOko+MzZGNywtQFdBRkxOUlNSMj5aYVpQYEpRUk';
var compressed = LZString.compress(orig);
console.log('compressed : '+compressed);
for (let i=0;i<compressed.length;i++) {
	let code = compressed.charCodeAt(i);
	console.log(code);
}
console.log("length of orig", orig.length);
console.log("length of compressed", compressed.length);

var decompressed = LZString.decompress(compressed);

console.log(orig);
console.log(decompressed);
console.log(new Buffer(compressed).toString("base64"));
console.log(new Buffer(compressed).toString("hex"));
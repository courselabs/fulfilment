
$images=@('fulfilment-api','fulfilment-processor','fulfilment-web','fulfilment-authz')

foreach ($image in $images)
{    
    docker manifest create --amend "courselabs/$($image)" `
      "courselabs/$($image):linux-arm64" `
      "courselabs/$($image):linux-amd64"
    
    docker manifest push "courselabs/$($image)"
}
